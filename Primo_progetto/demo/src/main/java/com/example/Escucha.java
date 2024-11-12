package com.example;

import java.util.LinkedList;

//import org.antlr.v4.runtime.ParserRuleContext;
//import org.antlr.v4.runtime.tree.TerminalNode;

import com.example.comp24Parser.BloqueContext;
import com.example.comp24Parser.DeclaracionContext;
import com.example.comp24Parser.ProgramaContext;
import com.example.comp24Parser.Funcion_definicionContext;
import com.example.comp24Parser.FactorContext;
import com.example.comp24Parser.ForContext;
import com.example.comp24Parser.WhileContext;
import com.example.comp24Parser.If_instruccionContext;
import com.example.comp24Parser.Else_instruccionContext;
//import com.example.TablaSimbolos;

public class Escucha extends comp24BaseListener{
    private TablaSimbolos tablaSimbolos = TablaSimbolos.getInstance();
    
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
         * pregunta para el profe: ¿Se debe chequear si estamos en una funcion para chequear si el tipo del
         * return coincide con el tipo de la declaracion de la funcion?
         */
        
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
         * pregunta para el profe: ¿Se debe chequear si la variable ya fue declarada en el mismo contexto?
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



    /* Pregunta para el profe:
    ¿Las siguiente son correctas?
    O se debe llamar addContexto solamente cuando se crea un nuevo bloque de codigo?
    */

    @Override
    public void enterFor(ForContext ctx) {
        TablaSimbolos.getInstance().addContexto();
    }

    @Override
    public void exitFor(ForContext ctx) {
        TablaSimbolos.getInstance().delContexto();
    }



    @Override
    public void enterWhile(WhileContext ctx) {
        TablaSimbolos.getInstance().addContexto();
    }

    @Override
    public void exitWhile(WhileContext ctx) {
        TablaSimbolos.getInstance().delContexto();
    }
	


    @Override
    public void enterIf_instruccion(If_instruccionContext ctx) {
        TablaSimbolos.getInstance().addContexto();
    }

    @Override
    public void exitIf_instruccion(If_instruccionContext ctx) {
        TablaSimbolos.getInstance().delContexto();
    }



    @Override
    public void enterElse_instruccion(Else_instruccionContext ctx) {
        TablaSimbolos.getInstance().addContexto();
    }
    
    @Override
    public void exitElse_instruccion(Else_instruccionContext ctx) {
        TablaSimbolos.getInstance().delContexto();
    }
	
}
