// Generated from c:/Users/Giuseppe/Desktop/Practica y Construccion de Compiladores/Primo_progetto/demo/target/classes/com/example/comp24.g4 by ANTLR 4.13.1

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
	 * Enter a parse tree produced by {@link comp24Parser#or_expr}.
	 * @param ctx the parse tree
	 */
	void enterOr_expr(comp24Parser.Or_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#or_expr}.
	 * @param ctx the parse tree
	 */
	void exitOr_expr(comp24Parser.Or_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#o}.
	 * @param ctx the parse tree
	 */
	void enterO(comp24Parser.OContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#o}.
	 * @param ctx the parse tree
	 */
	void exitO(comp24Parser.OContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(comp24Parser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(comp24Parser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(comp24Parser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(comp24Parser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#not_expr}.
	 * @param ctx the parse tree
	 */
	void enterNot_expr(comp24Parser.Not_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#not_expr}.
	 * @param ctx the parse tree
	 */
	void exitNot_expr(comp24Parser.Not_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(comp24Parser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(comp24Parser.CompContext ctx);
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
	 * Enter a parse tree produced by {@link comp24Parser#if_instruccion}.
	 * @param ctx the parse tree
	 */
	void enterIf_instruccion(comp24Parser.If_instruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#if_instruccion}.
	 * @param ctx the parse tree
	 */
	void exitIf_instruccion(comp24Parser.If_instruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#else_instruccion}.
	 * @param ctx the parse tree
	 */
	void enterElse_instruccion(comp24Parser.Else_instruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#else_instruccion}.
	 * @param ctx the parse tree
	 */
	void exitElse_instruccion(comp24Parser.Else_instruccionContext ctx);
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
	 * Enter a parse tree produced by {@link comp24Parser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void enterInicializacion(comp24Parser.InicializacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void exitInicializacion(comp24Parser.InicializacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#list_decl}.
	 * @param ctx the parse tree
	 */
	void enterList_decl(comp24Parser.List_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#list_decl}.
	 * @param ctx the parse tree
	 */
	void exitList_decl(comp24Parser.List_declContext ctx);
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
	 * Enter a parse tree produced by {@link comp24Parser#list_asign}.
	 * @param ctx the parse tree
	 */
	void enterList_asign(comp24Parser.List_asignContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#list_asign}.
	 * @param ctx the parse tree
	 */
	void exitList_asign(comp24Parser.List_asignContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#funcion_prototipo}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_prototipo(comp24Parser.Funcion_prototipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#funcion_prototipo}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_prototipo(comp24Parser.Funcion_prototipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#funcion_definicion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_definicion(comp24Parser.Funcion_definicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#funcion_definicion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_definicion(comp24Parser.Funcion_definicionContext ctx);
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
	 * Enter a parse tree produced by {@link comp24Parser#funcion_llamada}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_llamada(comp24Parser.Funcion_llamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#funcion_llamada}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_llamada(comp24Parser.Funcion_llamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link comp24Parser#func_llamada}.
	 * @param ctx the parse tree
	 */
	void enterFunc_llamada(comp24Parser.Func_llamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link comp24Parser#func_llamada}.
	 * @param ctx the parse tree
	 */
	void exitFunc_llamada(comp24Parser.Func_llamadaContext ctx);
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