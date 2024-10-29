package com.example;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.example.comp24Parser.BloqueContext;
import com.example.comp24Parser.DeclaracionContext;
//import com.example.comp24Parser.DeclaracionesContext;
import com.example.comp24Parser.ProgramaContext;

//import com.example.TablaSimbolos;

public class Escucha extends comp24BaseListener{
    private Integer nodos = 0, hojas = 0;
    
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        nodos++;
    }

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        System.out.println("Comienza el parsing...");
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        System.out.println("Visité " + nodos + " nodos");
        System.out.println("Visité " + hojas + " hojas");
        System.out.println("Fin del parsing!!!");
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        hojas++;
        System.out.println("\tHoja --> " + node.getText() + "<--");
    }

    @Override
    public void enterDeclaracion(DeclaracionContext ctx) {
        System.out.println("\tAnalizando declaracion");
        System.out.println("\t\tgetText() --> " + ctx.getText()+ "<--");
        System.out.println("\t\tgetChildCount() --> " + ctx.getChildCount()+ "<--");
    }

    @Override
    public void exitDeclaracion(DeclaracionContext ctx) {
        System.out.println("\tDeclaracion analizada");
        System.out.println("\t\tgetText() --> " + ctx.getText()+ "<--");
        System.out.println("\t\tgetChildCount() --> " + ctx.getChildCount()+ "<--");
    }

    @Override
    public void enterBloque(BloqueContext ctx) {
        TablaSimbolos.getInstance().addContexto();
    }

    /*@Override
    public void exitDeclaraciones(DeclaracionesContext ctx) {
        Variable id = new Variable(ctx.getText(), TipoDato.fromString(ctx.getChild(0).getText()));
        TablaSimbolos.getInstance().addIdentificador(id);
    }*/
    
}
