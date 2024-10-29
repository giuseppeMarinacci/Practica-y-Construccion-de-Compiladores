// Generated from c:/Users/Giuseppe/Desktop/Practica y Construccion de Compiladores/Primo_progetto/demo/target/classes/com/example/comp24.g4 by ANTLR 4.13.1

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
	 * Visit a parse tree produced by {@link comp24Parser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(comp24Parser.WhileContext ctx);
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
	 * Visit a parse tree produced by {@link comp24Parser#opal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpal(comp24Parser.OpalContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(comp24Parser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(comp24Parser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#acciones_iniciales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcciones_iniciales(comp24Parser.Acciones_inicialesContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#accion_inicial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion_inicial(comp24Parser.Accion_inicialContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#acciones_siempre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcciones_siempre(comp24Parser.Acciones_siempreContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#accion_siempre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion_siempre(comp24Parser.Accion_siempreContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#acciones_post}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcciones_post(comp24Parser.Acciones_postContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#accion_post}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion_post(comp24Parser.Accion_postContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#opales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpales(comp24Parser.OpalesContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#tdato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTdato(comp24Parser.TdatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(comp24Parser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(comp24Parser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(comp24Parser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#asignaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignaciones(comp24Parser.AsignacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#asign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsign(comp24Parser.AsignContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(comp24Parser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#funcion_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_decl(comp24Parser.Funcion_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(comp24Parser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumento(comp24Parser.ArgumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#funcion_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_call(comp24Parser.Funcion_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(comp24Parser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link comp24Parser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(comp24Parser.ParametrosContext ctx);
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