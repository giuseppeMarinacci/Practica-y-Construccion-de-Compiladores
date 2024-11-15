package com.example;

import java.io.File;
import java.util.LinkedList;

//import org.antlr.v4.runtime.ParserRuleContext;
//import org.antlr.v4.runtime.tree.TerminalNode;

import com.example.comp24Parser.BloqueContext;
import com.example.comp24Parser.DeclaracionContext;
import com.example.comp24Parser.ProgramaContext;
import com.example.comp24Parser.Funcion_definicionContext;
import com.example.comp24Parser.FactorContext;
import com.example.comp24Parser.Lista_argumentosContext;

public class Escucha extends comp24BaseListener{
    private TablaSimbolos tablaSimbolos = TablaSimbolos.getInstance();
    String absoluteFilePath = "C:\\Users\\Giuseppe\\Desktop\\Practica y Construccion de Compiladores\\Primo_progetto\\demo\\output\\tablaSimbolos.txt";    // path del archivo de texto donde se guardan la tabla de simbolos

    /*
     * tenemos que generar un archivo de texto donde imprimir 
     * todas los contextos antes de borrarlos
     */
    
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
        
        /* 
         * Se debe chequear si estamos en una funcion para chequear si el tipo del
         * return coincide con el tipo de la declaracion de la funcion!
         */
        /*
        if (ctx.getParent() instanceof Funcion_definicionContext) {
            Funcion funcion = (Funcion) tablaSimbolos.buscarGlobal(ctx.getParent().getChild(0).getChild(1).getText());
            if (funcion.getTipoDato() != TipoDato.VOID) {
                if (ctx.getChild(ctx.getChildCount() - 1) instanceof FactorContext) {
                    FactorContext factor = (FactorContext) ctx.getChild(ctx.getChildCount() - 1);
                    if (factor.ID() != null) {
                        ID id = tablaSimbolos.buscarGlobal(factor.ID().getText());
                        if (id != null) {
                            if (id instanceof Variable) {
                                if (((Variable) id).getTipoDato() != funcion.getTipoDato()) {
                                    System.err.println("Error semántico: tipo de retorno de la función " + funcion.getNombre() + " no coincide con el tipo de la declaración.");
                                }
                            }
                        }
                    }
                }
            } 
        }
        */
        TablaSimbolos.getInstance().delContexto(absoluteFilePath);
    }


    @Override
    public void exitFuncion_definicion(Funcion_definicionContext ctx) {
        /*
        System.out.println("Analizando la funcion: " + ctx.getChild(1).getText());
        LinkedList<Variable> args = new LinkedList<Variable>();
        String nombre;
        TipoDato tipo;

        if (ctx.getChild(3).getChild(0) != null) { // si la función tiene el primero argumento
            nombre = ctx.getChild(3).getChild(1).getText();
            tipo = TipoDato.fromString(ctx.getChild(3).getChild(0).getText());
            args.add(new Variable(nombre, tipo)); // se añade el primer argumento
            // System.out.println("Primer argumento: " + ctx.getChild(3).getChild(0).getText() + " " + nombre);

            if(ctx.getChild(4).getChildCount() > 0){ // si la función tiene el segundo argumento
                Lista_argumentosContext lista_argumentos = (Lista_argumentosContext) ctx.getChild(4);
                
                nombre = lista_argumentos.getChild(1).getChild(1).getText();
                tipo = TipoDato.fromString(lista_argumentos.getChild(1).getChild(0).getText());
                args.add(new Variable(nombre, tipo)); // se añade el segundo argumento
                // System.err.println("Segundo argumento: " + lista_argumentos.getChild(1).getChild(0).getText() + " " + nombre);

                while(lista_argumentos.getChild(2).getChildCount() > 0){ // mientras la lista de argumentos tenga más de dos argumento
                    lista_argumentos = (Lista_argumentosContext) lista_argumentos.getChild(2);
                    
                    nombre = lista_argumentos.getChild(1).getChild(1).getText();
                    tipo = TipoDato.fromString(lista_argumentos.getChild(1).getChild(0).getText());
                    args.add(new Variable(nombre, tipo)); // se añade el siguiente argumento
                    // System.err.println("Argumento: " + lista_argumentos.getChild(1).getChild(0).getText() + " " + nombre);
                }
            }            
        }
        
        Funcion funcion = new Funcion(ctx.getChild(1).getText(), // nombre de la función
                                    TipoDato.fromString(ctx.getChild(0).getText()), // tipo de la función
                                    args // lista de argumentos
                                    );
        */

        TablaSimbolos.getInstance().addIdentificador(new Variable(ctx.getChild(1).getText(), TipoDato.fromString(ctx.getChild(0).getText())));
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