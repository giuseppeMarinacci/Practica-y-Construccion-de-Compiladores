package com.example;

import java.io.File;
import java.util.LinkedList;
import java.util.ArrayList;

import org.antlr.v4.runtime.ParserRuleContext;
//import org.antlr.v4.runtime.tree.TerminalNode;

import com.example.comp24Parser.BloqueContext;
import com.example.comp24Parser.DeclaracionContext;
import com.example.comp24Parser.ProgramaContext;
import com.example.comp24Parser.Funcion_definicionContext;
import com.example.comp24Parser.Func_llamadaContext;
import com.example.comp24Parser.InstruccionesContext;
import com.example.comp24Parser.ReturnContext;
import com.example.comp24Parser.FactorContext;
import com.example.comp24Parser.Lista_argumentosContext;

public class Escucha extends comp24BaseListener{
    private TablaSimbolos tablaSimbolos = TablaSimbolos.getInstance();
    String absoluteFilePath = "C:\\Users\\Giuseppe\\Desktop\\Practica y Construccion de Compiladores\\Primo_progetto\\demo\\output\\tablaSimbolos.txt";    // path del archivo de texto donde se guardan la tabla de simbolos
    // opcional: resolverlo con path relativo

    // Borrar archivo
    public void delFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }
    }


    @Override
    public void enterPrograma(ProgramaContext ctx) {
        delFile(absoluteFilePath);

        System.out.println("Empezando a escuchar...");

        tablaSimbolos.addContexto();        
    }


    @Override
    public void exitPrograma(ProgramaContext ctx) {
        tablaSimbolos.delContexto(absoluteFilePath);
    }


    @Override
    public void enterBloque(BloqueContext ctx) {
        TablaSimbolos.getInstance().addContexto();
        
        // si el bloque es hijo de la definición de una función, se agrega el contexto de la función
        if (ctx.getParent() instanceof Funcion_definicionContext) {
            Funcion_definicionContext funcion_padre = (Funcion_definicionContext) ctx.getParent();
            LinkedList<Variable> args = new LinkedList<Variable>();
            String nombre;
            TipoDato tipo;

            if (funcion_padre.getChild(3).getChild(0) != null) { // si la función tiene el primero argumento
                nombre = funcion_padre.getChild(3).getChild(1).getText();
                tipo = TipoDato.fromString(funcion_padre.getChild(3).getChild(0).getText());
                args.add(new Variable(nombre, tipo)); // se añade el primer argumento

                if(funcion_padre.getChild(4).getChildCount() > 0){ // si la función tiene el segundo argumento
                    Lista_argumentosContext lista_argumentos = (Lista_argumentosContext) funcion_padre.getChild(4);
                    
                    nombre = lista_argumentos.getChild(1).getChild(1).getText();
                    tipo = TipoDato.fromString(lista_argumentos.getChild(1).getChild(0).getText());
                    args.add(new Variable(nombre, tipo)); // se añade el segundo argumento

                    while(lista_argumentos.getChild(2).getChildCount() > 0){ // mientras la función tenga más de dos argumento
                        lista_argumentos = (Lista_argumentosContext) lista_argumentos.getChild(2);
                        
                        nombre = lista_argumentos.getChild(1).getChild(1).getText();
                        tipo = TipoDato.fromString(lista_argumentos.getChild(1).getChild(0).getText());
                        args.add(new Variable(nombre, tipo)); // se añade el siguiente argumento
                    }


                }            
            }

            for(Variable arg : args) { // se añaden los argumentos al contexto
                TablaSimbolos.getInstance().addIdentificador(arg);
            }
        }
        
    }

    
    @Override
    public void exitBloque(BloqueContext ctx) {
        TipoDato tipo_funcion = null;
        Boolean return_encontrado = false;
        InstruccionesContext instrucciones = null;
        ReturnContext return_instruccion = null;
        
        if (ctx.getParent() instanceof Funcion_definicionContext) {
            tipo_funcion = TipoDato.fromString(ctx.getParent().getChild(0).getText());
            //System.out.println("Analizando la función: " + tipo_funcion.toString());
            
            instrucciones = (InstruccionesContext) ctx.getChild(1);
            //System.out.println("Instrucciones: " + instrucciones.getText() + " con child count: " + instrucciones.getChildCount());

            if (instrucciones.getChildCount() != 0){ // este "for" busca si hay una instrucción "return"
                while(instrucciones.getChildCount() != 0){
                    //System.out.println("Instruccion: " + instrucciones.getChild(0).getText());
                    if(instrucciones.getChild(0).getChild(0) instanceof ReturnContext){
                        return_encontrado = true;
                        return_instruccion = (ReturnContext) instrucciones.getChild(0).getChild(0);
                        break;
                    }
                    instrucciones = (InstruccionesContext) instrucciones.getChild(1);
                }
            }
            //System.out.println("Return encontrado: " + return_instruccion.getChild(0) + " " + return_instruccion.getChild(1));

            if (tipo_funcion != TipoDato.VOID) {
                //System.out.println("Funcion: " + tipo_funcion.toString() + " Tipo: " + TipoDato.VOID.toString());
                if(!return_encontrado){
                    System.err.println("Error semántico: función \"" + ctx.getParent().getChild(1).getText() + "\" no tiene return.");
                }
                else if (!correspondiente(return_instruccion, tipo_funcion)) {
                    //System.out.println("La función " + ctx.getParent().getChild(1).getText() + " no tiene un return correspondiente.");
                    System.err.println("Error semántico: tipo de retorno de la función \"" + ctx.getParent().getChild(1).getText() + "\" no coincide con el tipo de la declaración.");
                }
            }
            else{
                if (return_encontrado) {
                    System.err.println("Error semántico: función \"" + ctx.getParent().getChild(1).getText() + "\" de tipo VOID no puede retornar un valor.");
                }
            }
        }

        ArrayList<ID> no_usadas = TablaSimbolos.getInstance().buscarNoUsados();
        if (no_usadas.size() > 0) {
            for (ID id : no_usadas) {
                System.err.println("Warning: variable \"" + id.getNombre() + "\" declarada pero no usada.");
            }
        }
        
        TablaSimbolos.getInstance().delContexto(absoluteFilePath);
    }


    @Override
    public void exitFuncion_definicion(Funcion_definicionContext ctx) {
        
        TablaSimbolos.getInstance().addIdentificador(new Variable(ctx.getChild(1).getText(), TipoDato.fromString(ctx.getChild(0).getText())));
    }


    /* Funciones de exitDeclaracion:
     * - Chequear si la variable ya fue declarada en el contexto local
     * - Chequear que el tipo de una variable no sea "VOID"
     */
    @Override
    public void exitDeclaracion(DeclaracionContext ctx) {
        String nombre = ctx.getChild(1).getText();
        TipoDato tipo = TipoDato.fromString(ctx.getChild(0).getText());

        if(tipo == TipoDato.VOID){
            System.err.println("Error semántico: variable \"" + nombre + "\" no puede ser de tipo VOID.");
        }
        else if (TablaSimbolos.getInstance().buscarLocal(nombre) != null) {
            System.err.println("Error semántico: variable \"" + nombre + "\" ya declarada.");
        }
        else{
            Variable id = new Variable(nombre, tipo);
            TablaSimbolos.getInstance().addIdentificador(id);
        }
    }


    /* Funciones de exitFactor:
     * - Marcar una variable como usada
     * - Generar warning por una variable usada sin inicialización
     * - Generar error por una variable usada sin declaración
     */
    @Override
    public void exitFactor(FactorContext ctx) {
        if (ctx.ID() != null) {
            String nombre = ctx.ID().getText();
            ID id = tablaSimbolos.buscarGlobal(nombre);
            if (id != null) {
                if (id.getInicializado()) {
                    id.setUsado();
                }
                else {
                    id.setUsado();
                    //System.out.println("Warning parent: variable " + (ctx.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent() instanceof ReturnContext));
                    if(ctx.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent() instanceof ReturnContext){
                        System.err.println("Warning: variable \"" + nombre + "\" retornada sin inicialización.");
                    }
                    else {
                        System.err.println("Warning: variable \"" + nombre + "\" usada sin inicialización.");
                    }    
                }
            }
            else {
                System.err.println("Error semántico: variable \"" + nombre + "\" usada sin declaración.");
            }
        }
    }



    // Chequear que el tipo de retorno de una función sea correspondiente al tipo de la instrucción "return"
    Boolean correspondiente(ParserRuleContext ctx, TipoDato tipo_funcion){
        ctx = (ParserRuleContext) ctx.getChild(1);
        
        while(! (ctx instanceof FactorContext) ){
            ctx = (ParserRuleContext) ctx.getChild(0);
        }
        FactorContext factor = (FactorContext) ctx; // factor es el nodo que contiene el valor que se retorna

        // caso 1: factor es un número
        if(factor.NUMERO() != null){
            //System.out.println("Numero: " + factor.NUMERO().getText() + ", Tipo funcion: " + tipo_funcion.toString());
            if(tipo_funcion != TipoDato.INT && tipo_funcion != TipoDato.DOUBLE){
                return false;
            }
        }

        // caso 2: factor es una variable
        if(factor.ID() != null){
            ID id = tablaSimbolos.buscarLocal(factor.ID().getText());
            //System.out.println("ID: " + factor.ID().getText() + " tiene tipo: " + ((Variable) id).getTipoDato().toString() + ", Tipo funcion: " + tipo_funcion.toString());
            if(id != null){
                if(id instanceof Variable){
                    if(((Variable) id).getTipoDato() != tipo_funcion){
                        return false;
                    }
                }
            }
        }

        // caso 3: factor es una llamada a función
        if(factor.getChild(0) instanceof Func_llamadaContext){
            ID funcion = (ID) tablaSimbolos.buscarGlobal(factor.getChild(0).getChild(0).getText());
            //System.out.println("Funcion: " + factor.getChild(0).getChild(0).getText() + " tiene tipo: " + funcion.getTipoDato().toString() + ", Tipo funcion: " + tipo_funcion.toString());
            if(funcion.getTipoDato() != tipo_funcion){
                return false;
            }
        }

        return true;
    }
	
}