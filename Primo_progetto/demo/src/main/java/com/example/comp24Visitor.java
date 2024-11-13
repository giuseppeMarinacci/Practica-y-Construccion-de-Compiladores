// Generated from c:/Users/Giuseppe/Desktop/Practica y Construccion de Compiladores/Primo_progetto/demo/src/main/java/com/example/comp24.g4 by ANTLR 4.13.1

package com.example;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link comp24Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface comp24Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link comp24Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(comp24Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(comp24Parser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(comp24Parser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(comp24Parser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#tdato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTdato(comp24Parser.TdatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#opal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpal(comp24Parser.OpalContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expr(comp24Parser.Or_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#o}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitO(comp24Parser.OContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(comp24Parser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(comp24Parser.AContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#not_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_expr(comp24Parser.Not_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(comp24Parser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#co}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCo(comp24Parser.CoContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(comp24Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(comp24Parser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(comp24Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(comp24Parser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(comp24Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#if_instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_instruccion(comp24Parser.If_instruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#else_instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_instruccion(comp24Parser.Else_instruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(comp24Parser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(comp24Parser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#accion_inicial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion_inicial(comp24Parser.Accion_inicialContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#accion_siempre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion_siempre(comp24Parser.Accion_siempreContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#accion_post}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion_post(comp24Parser.Accion_postContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(comp24Parser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#inicializacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacion(comp24Parser.InicializacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#list_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_decl(comp24Parser.List_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(comp24Parser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#funcion_prototipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_prototipo(comp24Parser.Funcion_prototipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#funcion_definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_definicion(comp24Parser.Funcion_definicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#lista_argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_argumentos(comp24Parser.Lista_argumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumento(comp24Parser.ArgumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#funcion_llamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_llamada(comp24Parser.Funcion_llamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#func_llamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_llamada(comp24Parser.Func_llamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#lista_parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parametros(comp24Parser.Lista_parametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(comp24Parser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(comp24Parser.ReturnContext ctx);
}