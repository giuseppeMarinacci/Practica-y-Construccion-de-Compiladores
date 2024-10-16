package com.example;

import org.antlr.v4.runtime.tree.TerminalNode;

import com.example.comp24Parser.DeclaracionContext;
import com.example.comp24Parser.InstruccionesContext;
import com.example.comp24Parser.ProgramaContext;

//import comp24BaseVisitor;

public class Walker extends com.example.comp24BaseVisitor<String> {

    @Override
    public String visitDeclaracion(DeclaracionContext ctx) {
        System.out.println("Declaracion --> " + ctx.getChild(0).getText());
        System.out.println("            --> " + ctx.getChild(1).getText());
        return super.visitDeclaracion(ctx);
    }

    @Override
    public String visitPrograma(ProgramaContext ctx) {
        System.out.println("Comienza programa -> Hijos = " + ctx.getChildCount());
        System.out.println("Hijo 0 --> Nieto 1 --> " + ctx.getChild(0).getChild(1).getText());
        return super.visitInstrucciones((InstruccionesContext)ctx.getChild(0));
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        System.out.println("Token --> " + node.getText());
        return super.visitTerminal(node);
    }
    
}
