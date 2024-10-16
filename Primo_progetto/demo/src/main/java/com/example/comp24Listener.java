// Generated from c:/Users/Giuseppe/Desktop/Practica y Construccion de Compiladores/Primo_progetto/demo/src/main/java/com/example/comp24.g4 by ANTLR 4.13.1

// QUESTO SI USA PER FARE ANALISI SEMANTICA

package com.example;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link comp24Parser}.
 */
public interface comp24Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link comp24Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(comp24Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(comp24Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(comp24Parser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(comp24Parser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(comp24Parser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(comp24Parser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(comp24Parser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(comp24Parser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(comp24Parser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(comp24Parser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(comp24Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(comp24Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(comp24Parser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(comp24Parser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(comp24Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(comp24Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(comp24Parser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(comp24Parser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(comp24Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(comp24Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#opal}.
	 * @param ctx the parse tree
	 */
	void enterOpal(comp24Parser.OpalContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#opal}.
	 * @param ctx the parse tree
	 */
	void exitOpal(comp24Parser.OpalContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(comp24Parser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(comp24Parser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(comp24Parser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(comp24Parser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#acciones_iniciales}.
	 * @param ctx the parse tree
	 */
	void enterAcciones_iniciales(comp24Parser.Acciones_inicialesContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#acciones_iniciales}.
	 * @param ctx the parse tree
	 */
	void exitAcciones_iniciales(comp24Parser.Acciones_inicialesContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#accion_inicial}.
	 * @param ctx the parse tree
	 */
	void enterAccion_inicial(comp24Parser.Accion_inicialContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#accion_inicial}.
	 * @param ctx the parse tree
	 */
	void exitAccion_inicial(comp24Parser.Accion_inicialContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#acciones_siempre}.
	 * @param ctx the parse tree
	 */
	void enterAcciones_siempre(comp24Parser.Acciones_siempreContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#acciones_siempre}.
	 * @param ctx the parse tree
	 */
	void exitAcciones_siempre(comp24Parser.Acciones_siempreContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#accion_siempre}.
	 * @param ctx the parse tree
	 */
	void enterAccion_siempre(comp24Parser.Accion_siempreContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#accion_siempre}.
	 * @param ctx the parse tree
	 */
	void exitAccion_siempre(comp24Parser.Accion_siempreContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#acciones_post}.
	 * @param ctx the parse tree
	 */
	void enterAcciones_post(comp24Parser.Acciones_postContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#acciones_post}.
	 * @param ctx the parse tree
	 */
	void exitAcciones_post(comp24Parser.Acciones_postContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#accion_post}.
	 * @param ctx the parse tree
	 */
	void enterAccion_post(comp24Parser.Accion_postContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#accion_post}.
	 * @param ctx the parse tree
	 */
	void exitAccion_post(comp24Parser.Accion_postContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#opales}.
	 * @param ctx the parse tree
	 */
	void enterOpales(comp24Parser.OpalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#opales}.
	 * @param ctx the parse tree
	 */
	void exitOpales(comp24Parser.OpalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#tdato}.
	 * @param ctx the parse tree
	 */
	void enterTdato(comp24Parser.TdatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#tdato}.
	 * @param ctx the parse tree
	 */
	void exitTdato(comp24Parser.TdatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(comp24Parser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(comp24Parser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(comp24Parser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(comp24Parser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(comp24Parser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(comp24Parser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void enterAsignaciones(comp24Parser.AsignacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void exitAsignaciones(comp24Parser.AsignacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#asign}.
	 * @param ctx the parse tree
	 */
	void enterAsign(comp24Parser.AsignContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#asign}.
	 * @param ctx the parse tree
	 */
	void exitAsign(comp24Parser.AsignContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(comp24Parser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(comp24Parser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#funcion_decl}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_decl(comp24Parser.Funcion_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#funcion_decl}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_decl(comp24Parser.Funcion_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(comp24Parser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(comp24Parser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#argumento}.
	 * @param ctx the parse tree
	 */
	void enterArgumento(comp24Parser.ArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#argumento}.
	 * @param ctx the parse tree
	 */
	void exitArgumento(comp24Parser.ArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#funcion_call}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_call(comp24Parser.Funcion_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#funcion_call}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_call(comp24Parser.Funcion_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(comp24Parser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(comp24Parser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(comp24Parser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(comp24Parser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(comp24Parser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(comp24Parser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(comp24Parser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(comp24Parser.ReturnContext ctx);
}