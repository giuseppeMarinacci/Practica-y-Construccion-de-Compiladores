package com.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.example.comp24Parser.AsignacionContext;
import com.example.comp24Parser.CoContext;
import com.example.comp24Parser.CompContext;
import com.example.comp24Parser.DeclaracionContext;
import com.example.comp24Parser.EContext;
import com.example.comp24Parser.Else_instruccionContext;
import com.example.comp24Parser.ExpContext;
import com.example.comp24Parser.TermContext;
import com.example.comp24Parser.WhileContext;
import com.example.comp24Parser.FactorContext;
import com.example.comp24Parser.ForContext;
import com.example.comp24Parser.Funcion_definicionContext;
import com.example.comp24Parser.If_instruccionContext;
import com.example.comp24Parser.List_declContext;
import com.example.comp24Parser.ProgramaContext;
import com.example.comp24Parser.TContext;

public class Walker extends com.example.comp24BaseVisitor<String> {

    private int contador_tmp = 0, contador_etq = 0; // Contador para los registros temporales
    private List<String> tacCode = new ArrayList<>(); // Lista para memorizar el Código de Tres Direcciones (TAC)
    String absoluteFilePath = "C:\\Users\\Giuseppe\\Desktop\\Practica y Construccion de Compiladores\\Primo_progetto\\demo\\output\\TAC.txt"; // path del archivo de texto donde se guarda el Código de Tres Direcciones (TAC)
    
    // Borrar archivo de output para limpiar el Código de Tres Direcciones antes de empezar a visitar
    public void delFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }
    }

    public void imprimirTAC(String filePath, List<String> tacCode) {
        try {
            java.io.FileWriter fw = new java.io.FileWriter(filePath, true);
            for(String line : tacCode) {
                fw.write(line + "\n");
            }
            fw.close();
        } catch (Exception e) {
            throw new RuntimeException("Error al escribir en el archivo");
        }
    }

    private String nuevoTmp() {
        return "t" + (contador_tmp++);
    }

    private String nuevaEtq() {
        return "L" + (contador_etq++);
    }




    @Override
    public String visitPrograma(ProgramaContext ctx) {
        delFile(absoluteFilePath);
        
        System.out.println("\n--------------------------------------------------\n");
        System.out.println("Empezando a visitar!\n");
        
        return super.visitPrograma(ctx);
    }


    @Override
    public String visitDeclaracion(DeclaracionContext ctx) {
        String id = ctx.ID().getText();
        String value = visit(ctx.inicializacion().opal().or_expr().and_expr().not_expr().comp().exp());
        
        tacCode.add(id + " = " + value);

        if(ctx.list_decl().getChildCount() != 0){
            visit(ctx.list_decl());
        }
        
        return null;
    }


    @Override
    public String visitList_decl(List_declContext ctx) {
        String id = ctx.ID().getText();
        String value = visit(ctx.inicializacion().opal().or_expr().and_expr().not_expr().comp().exp());
        
        tacCode.add(id + " = " + value);

        if(ctx.list_decl().getChildCount() != 0){
            visit(ctx.list_decl());
        }
        
        return null;
    }


    @Override
    public String visitAsignacion(AsignacionContext ctx) {
        String id = ctx.ID().getText();
        String value = visit(ctx.opal().or_expr().and_expr().not_expr().comp().exp());
        
        tacCode.add(id + " = " + value);
        
        /*
        imprimirTAC(absoluteFilePath, s);        

        tacCode.clear();
        */
        return null;
    }


    @Override
    public String visitExp(ExpContext ctx) {
        String exp = visit(ctx.term());
        
        if (ctx.e().getChildCount() == 0) {
            
            return exp;
        }
        else{
            String e = visit(ctx.e());
            String tmp = nuevoTmp();
            exp = tmp + " = " + exp + " " + e;
            tacCode.add(exp);
            
            return tmp;
        }
    }
   

    @Override
    public String visitE(EContext ctx) {
        String operador = ctx.getChild(0).getText();
        String term = visit(ctx.term());
        String e = operador + " " + term;

        if(ctx.e().getChildCount() == 0){
            return e;
        }
        else{
            String tmp = nuevoTmp();
            tacCode.add(tmp + " = " + term + " " + visit(ctx.e()));
            
            return operador + " " + tmp;
        }
    }


    @Override
    public String visitTerm(TermContext ctx) {
        String factor = visit(ctx.factor());

        if (ctx.t().getChildCount() == 0) {
            return factor;
        }
        else{
            String t = visit(ctx.t());
            String tmp = nuevoTmp();
            tacCode.add(tmp + " = " + factor + " " + t);
            
            return tmp;
        }
    }


    @Override
    public String visitT(TContext ctx) {
        String operador = ctx.getChild(0).getText();
        String factor = visit(ctx.factor());
        String t = operador + " " + factor;

        if(ctx.t().getChildCount() == 0){
            return t;
        }
        else{
            String tmp = nuevoTmp();
            tacCode.add(tmp + " = " + factor + " " + visit(ctx.t()));
            
            return operador + " " + tmp;
        }
    }


    @Override
    public String visitFactor(FactorContext ctx) {
        String factor = "";

        if (ctx.NUMERO() != null) { // Si el factor es un numero
            factor = ctx.NUMERO().getText();
        }

        if (ctx.ID() != null) { // Si el factor es el ID de una variable
            factor = ctx.ID().getText();
        }

        if (ctx.PA() != null && ctx.PC() != null) { // Si el factor es una expresión aritmetica entre parentesis
            factor = visit(ctx.exp());
        }

        if (ctx.OPERADOR_UNARIO() != null) { // Si el factor es una operción con operador unario
            String operador = ctx.OPERADOR_UNARIO().toString();
            String operando = ctx.ID().getText();
            factor = operando; // factor = nuevoTmp();
            
            if(operador.equals("++")) {
                tacCode.add(factor + " = " + operando + " + 1");
            } else{
                tacCode.add(factor + " = " + operando + " - 1");
            }
        }

        if (ctx.RESTA() != null) { // Si el factor es el negativo de una variable
            String operando = visit(ctx.factor());
            factor = nuevoTmp();
            tacCode.add(factor + " = - " + operando);
        }

        return factor;
    }


    @Override
    public String visitIf_instruccion(If_instruccionContext ctx) {
        String comp = " ";
        comp = visit(ctx.opal().or_expr().and_expr().not_expr().comp());

        String etq1 = nuevaEtq();
        tacCode.add("ifjmp " + comp + ", " + etq1);

        visit(ctx.instruccion());

        String etq2 = nuevaEtq();
        tacCode.add("jmp " + etq2);
        tacCode.add(etq1 + ":");
        
        visit(ctx.else_instruccion());
        tacCode.add(etq2 + ":");

        /*
        imprimirTAC(absoluteFilePath, tacCode);
        */

        return null;
    }


    @Override
    public String visitElse_instruccion(Else_instruccionContext ctx) {
        return super.visitElse_instruccion(ctx);
    }


    @Override
    public String visitComp(CompContext ctx) {
        String exp = visit(ctx.exp());

        if(ctx.co().getChildCount() == 0){
            return exp;
        }
        else{
            String co = visit(ctx.co());
            String tmp = nuevoTmp();
            tacCode.add(tmp + " = " + exp + " " + co);
            
            return tmp;
        }
    }


    @Override
    public String visitCo(CoContext ctx) {
        String co = ctx.COMPARACION().getText();
        String exp = visit(ctx.exp());

        return co + " " + exp;
    }


    @Override
    public String visitFor(ForContext ctx) {
        visit(ctx.accion_inicial());

        String etq_principio = nuevaEtq();
        tacCode.add(etq_principio + ":");

        String accion_siempre = visit(ctx.accion_siempre().opal().or_expr().and_expr().not_expr().comp());

        String etq_salida = nuevaEtq();
        tacCode.add("ifjmp " + accion_siempre + ", " + etq_salida);

        visit(ctx.instruccion());

        visit(ctx.accion_post());

        tacCode.add("jmp " + etq_principio);
        tacCode.add(etq_salida + ":");

        /*
        for(String s : tacCode){
            System.out.println(s);
        }
        */

        //imprimirTAC(absoluteFilePath, tacCode);

        return null;
    }


    @Override
    public String visitWhile(WhileContext ctx) {
        String etq_principio = nuevaEtq();
        tacCode.add(etq_principio + ":");

        String comparacion = visit(ctx.opal().or_expr().and_expr().not_expr().comp());

        String etq_salida = nuevaEtq();
        tacCode.add("ifjmp " + comparacion + ", " + etq_salida);

        visit(ctx.instruccion());

        tacCode.add("jmp " + etq_principio);
        tacCode.add(etq_salida + ":");

        /*
        for(String s : tacCode){
            System.out.println(s);
        }
        */
        
        //imprimirTAC(absoluteFilePath, tacCode);

        return null;
    }


    @Override
    public String visitFuncion_definicion(Funcion_definicionContext ctx) {
        //imprimirTAC(absoluteFilePath, tacCode);
        return null;
    }

    
}