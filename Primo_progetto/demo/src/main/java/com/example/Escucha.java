package com.example;

import java.util.LinkedList;

//import org.antlr.v4.runtime.ParserRuleContext;
//import org.antlr.v4.runtime.tree.TerminalNode;

import com.example.comp24Parser.BloqueContext;
import com.example.comp24Parser.DeclaracionContext;
import com.example.comp24Parser.ProgramaContext;
import com.example.comp24Parser.Funcion_definicionContext;
import com.example.comp24Parser.FactorContext;


public class Escucha extends comp24BaseListener{
    private TablaSimbolos tablaSimbolos = TablaSimbolos.getInstance();
    
    /*
     * tenemos que generar un archivo de texto donde imprimir 
     * todas los contextos antes de borrarlos
     */

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        tablaSimbolos.addContexto();
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        tablaSimbolos.delContexto();
    }



    @Override
    public void enterBloque(BloqueContext ctx) {
        TablaSimbolos.getInstance().addContexto();

        // si el bloque es hijo de la definición una función, se agrega el contexto de la función
        if (ctx.getParent() instanceof Funcion_definicionContext) {
            Funcion funcion = (Funcion) tablaSimbolos.buscarGlobal(ctx.getParent().getChild(0).getChild(1).getText());
            LinkedList<Variable> parametros = funcion.getArgs();
            
            for(int i = 0; i < parametros.size(); i++) {
                Variable id = new Variable(parametros.get(i).getNombre(), parametros.get(i).getTipoDato());
                TablaSimbolos.getInstance().addIdentificador(id);
            }
        }
    }
    
    @Override
    public void exitBloque(BloqueContext ctx) {
        
        /* 
         * Se debe chequear si estamos en una funcion para chequear si el tipo del
         * return coincide con el tipo de la declaracion de la funcion!
         */
        
        // escribir el contexto en el archivo antes de borrarlo

        TablaSimbolos.getInstance().delContexto();
    }



    @Override
    public void exitDeclaracion(DeclaracionContext ctx) {
        /*
        System.out.println("Declaracion: getText() = " + ctx.getText());
        System.out.println("Declaracion: getChild(0).getText() = " + ctx.getChild(0).getText());
        System.out.println("Declaracion: getChild(1).getText() = " + ctx.getChild(1).getText());
        */

        /* 
         * 1. Se debe chequear si la variable ya fue declarada en el contexto local
         * 2. Se debe chequear que el tipo de una variable no sea "VOID"
         */
        Variable id = new Variable(ctx.getChild(1).getText(), TipoDato.fromString(ctx.getChild(0).getText()));
        TablaSimbolos.getInstance().addIdentificador(id);
    }


    
    // Setear variable como inicializada
    @Override
    public void exitFactor(FactorContext ctx) {
        if (ctx.ID() != null) {
            String nombre = ctx.ID().getText();
            ID id = tablaSimbolos.buscarGlobal(nombre);
            if (id != null) {
                if (id instanceof Variable) {
                    id.setInicializado();
                }
            }
            else {
                System.err.println("Error semántico: variable " + nombre + " no declarada");
            }
        }
    }

	
}