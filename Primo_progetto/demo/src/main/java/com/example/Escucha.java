package com.example;

import java.io.File;
import java.util.LinkedList;
import java.util.ArrayList;

import org.antlr.v4.runtime.ParserRuleContext;

import com.example.comp24Parser.AsignacionContext;
import com.example.comp24Parser.BloqueContext;
import com.example.comp24Parser.DeclaracionContext;
import com.example.comp24Parser.Else_instruccionContext;
import com.example.comp24Parser.ProgramaContext;
import com.example.comp24Parser.Funcion_definicionContext;
import com.example.comp24Parser.If_instruccionContext;
import com.example.comp24Parser.Func_llamadaContext;
import com.example.comp24Parser.InstruccionesContext;
import com.example.comp24Parser.List_declContext;
import com.example.comp24Parser.ReturnContext;
import com.example.comp24Parser.WhileContext;
import com.example.comp24Parser.FactorContext;
import com.example.comp24Parser.ForContext;
import com.example.comp24Parser.Lista_argumentosContext;

public class Escucha extends comp24BaseListener{
    private TablaSimbolos tablaSimbolos = TablaSimbolos.getInstance();
    String absoluteFilePath = "C:\\Users\\Giuseppe\\Desktop\\Practica y Construccion de Compiladores\\Primo_progetto\\demo\\output\\tablaSimbolos.txt";    // path del archivo de texto donde se guardan la tabla de simbolos
    String warnings = ""; // String donde se guardan los warnings

    // Borrar archivo de output para limpiar la tabla de simbolos antes de empezar a escuchar
    public void delFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }
    }


    /* Funciones de enterPrograma:
     * - crear un nuevo (el primer) contexto en la tabla de símbolos
     * - borrar el archivo de output para limpiar la tabla de símbolos
     */
    @Override
    public void enterPrograma(ProgramaContext ctx) {
        delFile(absoluteFilePath);

        System.out.println("\n--------------------------------------------------\n");
        System.out.println("Empezando a escuchar!\n");

        tablaSimbolos.addContexto();
    }


    /* Funciones de exitPrograma:
     * - borrar el primer contexto de la tabla de símbolos
     */
    @Override
    public void exitPrograma(ProgramaContext ctx) {

        if(warnings.length() > 0){
            System.out.println(warnings);
        }
        else{
            System.out.println("No hay warnings ni errores.\n");
        }

        tablaSimbolos.delContexto(absoluteFilePath);

        System.out.println("Terminando de escuchar!");
        System.out.println("\n--------------------------------------------------\n");
    }


    /* Funciones de enterBloque:
     * - crear un nuevo contexto en la tabla de símbolos
     * - si el bloque es hijo de la definición de una función, se agrega el contexto de la función (si la función no es "main", se marcan los argumentos como inicializados para evitar warnings)
     * - si el bloque es hijo de un "if", "else", "for" o "while", se agregan las variables declaradas en el bloque padre al contexto del bloque actual
     */
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

            // Se añaden los argumentos al contexto
            if (ctx.getParent().getChild(1).getText() == "main"){
                for(Variable arg : args) {
                    TablaSimbolos.getInstance().addIdentificador(arg);
                }
            }
            else{
                for(Variable arg : args) {
                    arg.setInicializado(); // si la función no es "main", se marcan los argumentos como inicializados para evitar warnings inutiles
                    TablaSimbolos.getInstance().addIdentificador(arg);
                }
            }
        }

        // si el bloque es hijo de un "if", "else", "for" o "while", se agregan las variables declaradas en el bloque padre al contexto del bloque actual
        if (ctx.getParent().getParent() instanceof If_instruccionContext ||
            ctx.getParent().getParent() instanceof Else_instruccionContext ||
            ctx.getParent().getParent() instanceof ForContext ||
            ctx.getParent().getParent() instanceof WhileContext) {
            ArrayList<ID> to_add = TablaSimbolos.getInstance().buscarIDsPadre();
            
            for (ID id : to_add) {
                TablaSimbolos.getInstance().addIdentificador(id);
            }
        }
    }


    /* Funciones de exitBloque:
     * - chequear si hay variables declaradas pero no usadas
     * - borrar el contexto actual de la tabla de símbolos
     * - chequear si es el bloque de codigo de una función. Si sí:
     *      - chequear si la función no es de tipo VOID y no tiene un "return"
     *      - chequear si la función es de tipo VOID y tiene "return"
     *      - chequear si el tipo de retorno coincide con el tipo de la declaración
     */
    @Override
    public void exitBloque(BloqueContext ctx) {
        TipoDato tipo_funcion = null;
        Boolean return_encontrado = false;
        InstruccionesContext instrucciones = null;
        ReturnContext return_instruccion = null;
        
        if (ctx.getParent() instanceof Funcion_definicionContext) {
            tipo_funcion = TipoDato.fromString(ctx.getParent().getChild(0).getText());
            
            instrucciones = (InstruccionesContext) ctx.getChild(1);
            
            if (instrucciones.getChildCount() != 0){ // si el bloque tiene instrucciones
                while(instrucciones.getChildCount() != 0){ // este "while" busca si hay una instrucción "return" en el bloque
                    if(instrucciones.getChild(0).getChild(0) instanceof ReturnContext){
                        return_encontrado = true;
                        return_instruccion = (ReturnContext) instrucciones.getChild(0).getChild(0);
                        break;
                    }
                    instrucciones = (InstruccionesContext) instrucciones.getChild(1);
                }
            }
            
            if (tipo_funcion != TipoDato.VOID) {
                if(!return_encontrado){
                    throw new RuntimeException("Error semántico: función \"" + ctx.getParent().getChild(1).getText() + "\" no tiene return.");
                    }
                else if (!correspondiente(return_instruccion, tipo_funcion)) {
                    throw new RuntimeException("Error semántico: tipo de retorno de la función \"" + ctx.getParent().getChild(1).getText() + "\" no coincide con el tipo de la declaración.");
                }
            }
            else{
                if (return_encontrado) {
                    throw new RuntimeException("Error semántico: función \"" + ctx.getParent().getChild(1).getText() + "\" de tipo VOID no puede retornar un valor.");
                }
            }
        }

        ArrayList<ID> no_usadas = TablaSimbolos.getInstance().buscarNoUsados();
        if (no_usadas.size() > 0) {
            for (ID id : no_usadas) {
                warnings += "Warning: variable \"" + id.getNombre() + "\" declarada pero no usada.\n";
            }
        }
        
        TablaSimbolos.getInstance().delContexto(absoluteFilePath);
    }


    /* Funciones de exitFuncion_definicion:
     * - chequear si la función ya fue declarada en el contexto global
     * - agregar la función a la tabla de símbolos
     */
    @Override
    public void exitFuncion_definicion(Funcion_definicionContext ctx) {
        LinkedList<Variable> args = new LinkedList<Variable>();
        String nombre_funcion = ctx.getChild(1).getText();
        TipoDato tipo_funcion = TipoDato.fromString(ctx.getChild(0).getText());
        
        if(tablaSimbolos.buscarGlobal(nombre_funcion) != null){
            throw new RuntimeException("Error semántico: función \"" + nombre_funcion + "\" ya declarada.");
        }
        else {
            if(ctx.getChild(3).getChildCount() > 0){ // este "if" busca si la función tiene argumentos y los agrega a la lista "args"
                String nombre_argumento = ctx.getChild(3).getChild(1).getText();
                TipoDato tipo_argumento = TipoDato.fromString(ctx.getChild(3).getChild(0).getText());
                ParserRuleContext tmp = (ParserRuleContext) ctx.getChild(3);

                args.add(new Variable(nombre_argumento, tipo_argumento));

                if(ctx.getChild(4).getChildCount() > 0){
                    tmp = (ParserRuleContext) ctx.getChild(4);
                    while(tmp.getChildCount() > 0){
                        nombre_argumento = tmp.getChild(1).getChild(1).getText();
                        tipo_argumento = TipoDato.fromString(tmp.getChild(1).getChild(0).getText());
                        args.add(new Variable(nombre_argumento, tipo_argumento));
                        tmp = (ParserRuleContext) tmp.getChild(2);
                    }
                }
            }

            TablaSimbolos.getInstance().addIdentificador(new Funcion(nombre_funcion, tipo_funcion, args));
        }
    }


    /* Funciones de exitDeclaracion:
     * - Chequear si la variable ya fue declarada en el contexto local
     * - Chequear que el tipo de una variable no sea "VOID"
     * - Poner el flag "inicializado" = true si la declaración tiene inizialización
     * - Agregar la variable a la tabla de símbolos
     */
    @Override
    public void exitDeclaracion(DeclaracionContext ctx) {
        String nombre = ctx.getChild(1).getText();
        TipoDato tipo = TipoDato.fromString(ctx.getChild(0).getText());

        if(tipo == TipoDato.VOID){
            throw new RuntimeException("Error semántico: variable \"" + nombre + "\" no puede ser de tipo VOID.");
        }
        else if (TablaSimbolos.getInstance().buscarLocal(nombre) != null) {
            throw new RuntimeException("Error semántico: variable \"" + nombre + "\" ya declarada.");
        }
        else{
            Variable id = new Variable(nombre, tipo);
            if (ctx.getChild(2).getChildCount() > 0) {
                id.setInicializado();
            }
            TablaSimbolos.getInstance().addIdentificador(id);
        }
    }


    /* Funciones de exitList_decl:
     * - Chequear si cada variable ya fue declarada en el contexto local
     * - Chequear que el tipo de una variable no sea VOID
     * - Poner el flag "inicializado" = true si la declaración tiene inizialización
     * - Agregar la variable a la tabla de símbolos
     */
    @Override
    public void exitList_decl(List_declContext ctx) {
        if(ctx.getChildCount() > 0){  
            String nombre = ctx.getChild(1).getText();
            TipoDato tipo;
            ParserRuleContext tmp = ctx;

            while(! (tmp.getParent() instanceof DeclaracionContext)){
                tmp = (List_declContext) tmp.getParent();
            }
            tmp = (DeclaracionContext) tmp.getParent();
            tipo = TipoDato.fromString(tmp.getChild(0).getText());
            

            if(tipo == TipoDato.VOID){
                throw new RuntimeException("Error semántico: variable \"" + nombre + "\" no puede ser de tipo VOID.");
            }
            else if (TablaSimbolos.getInstance().buscarLocal(nombre) != null) {
                throw new RuntimeException("Error semántico: variable \"" + nombre + "\" ya declarada.");
            }
            else{
                Variable id = new Variable(nombre, tipo);
                if (ctx.getChild(2).getChildCount() > 0) {
                    id.setInicializado();
                }
                TablaSimbolos.getInstance().addIdentificador(id);
            }
        }
    }


    /* Funciones de exitAsignacion:
     * - Chequear si la variable a la izquierda del "=" ya fue declarada en el contexto local
     * - Marcar una variable como inicializada
     */
    @Override
    public void exitAsignacion(AsignacionContext ctx) {
        String nombre = ctx.getChild(0).getText();
        ID id = TablaSimbolos.getInstance().buscarLocal(nombre);
        
        if (id == null) {
            throw new RuntimeException("Error semántico: variable \"" + nombre + "\" no declarada.");
        }
        else {
            ((Variable) id).setInicializado();
        }
    }


    /* Funciones de exitFunc_llamada:
     * - Chequear si la función llamada fue declarada en el contexto global
     * - Chequear si la función fue llamada con el número correcto de argumentos
     * - Chequear si los argumentos de la función llamada tienen el tipo correcto
     */
    @Override
    public void exitFunc_llamada(Func_llamadaContext ctx) {
        String nombre_funcion = ctx.getChild(0).getText();
        LinkedList<Variable> args = new LinkedList<Variable>();

        if(tablaSimbolos.buscarGlobal(nombre_funcion) != null){
            ID funcion = tablaSimbolos.buscarGlobal(nombre_funcion);
            
            if(funcion instanceof Funcion){ // si la función llamada tiene argumentos, se agregan a la lista "args"
                if(ctx.getChild(2).getChildCount() > 0){
                    
                    String nombre_parametro;
                    TipoDato tipo_parametro;
                    ParserRuleContext tmp = (ParserRuleContext) ctx.getChild(2);

                    while(! (tmp.getChild(0) instanceof FactorContext)){
                        tmp = (ParserRuleContext) tmp.getChild(0);
                    }
                    tmp = (FactorContext) tmp.getChild(0);
                    
                    if(tmp.getChild(0) instanceof ID){
                        nombre_parametro = tmp.getChild(0).getText();
                        tipo_parametro = tablaSimbolos.buscarLocal(nombre_parametro).getTipoDato();
                    }
                    else{
                        nombre_parametro = tmp.getChild(0).getText();
                        tipo_parametro = TipoDato.INT;
                    }
                    
                    args.add(new Variable(nombre_parametro, tipo_parametro));

                    if(ctx.getChild(3).getChildCount() > 0){
                        
                        tmp = (ParserRuleContext) ctx.getChild(3);
                        
                        while(tmp.getChildCount() > 0){
                            ParserRuleContext tmp2 = (ParserRuleContext) tmp.getChild(1);
                            
                            while(! (tmp2.getChild(0) instanceof FactorContext)){
                                tmp2 = (ParserRuleContext) tmp2.getChild(0);
                            }
                            tmp2 = (FactorContext) tmp2.getChild(0);

                            if(tmp.getChild(0) instanceof ID){
                                nombre_parametro = tmp.getChild(0).getText();
                                tipo_parametro = tablaSimbolos.buscarLocal(nombre_parametro).getTipoDato();
                            }
                            else{
                                nombre_parametro = tmp.getChild(0).getText();
                                tipo_parametro = TipoDato.INT;
                            }
                            
                            args.add(new Variable(nombre_parametro, tipo_parametro));
                            
                            tmp = (ParserRuleContext) tmp.getChild(2);
                        }
                    }
                }

                if(((Funcion) funcion).getArgs().size() != args.size()){
                    throw new RuntimeException("Error semántico: función \"" + nombre_funcion + "\" llamada con número incorrecto de argumentos (se esperaban " + ((Funcion) funcion).getArgs().size() + ", se encontraron " + args.size() + ").");
                }
                else{
                    for(int i = 0; i < args.size(); i++){
                        if(((Funcion) funcion).getArgs().get(i).getTipoDato() != args.get(i).getTipoDato()){
                            throw new RuntimeException("Error semántico: función \"" + nombre_funcion + "\" llamada con argumento de tipo incorrecto (se esperaba " + ((Funcion) funcion).getArgs().get(i).getTipoDato().toString() + ", se encontró " + args.get(i).getTipoDato().toString() + ").");
                        }
                    }
                }
            }
        }
        else{
            throw new RuntimeException("Error semántico: función \"" + nombre_funcion + "\" no declarada.");
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
                    if(ctx.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent() instanceof ReturnContext){
                        warnings += "Warning: variable \"" + nombre + "\" retornada sin inicialización.\n";
                    }
                    else {
                        warnings += "Warning: variable \"" + nombre + "\" usada sin inicialización.\n";
                    }    
                }
            }
            else {
                throw new RuntimeException("Error semántico: variable \"" + nombre + "\" usada sin declaración.");
            }
        }
    }


    /* Funciones de correspondiente:
     * - Chequear que el tipo de retorno de una función sea correspondiente al tipo de la variable retornada
     */
    Boolean correspondiente(ParserRuleContext ctx, TipoDato tipo_funcion){
        ctx = (ParserRuleContext) ctx.getChild(1);
        
        while(! (ctx instanceof FactorContext) ){
            ctx = (ParserRuleContext) ctx.getChild(0);
        }
        FactorContext factor = (FactorContext) ctx; // factor es el nodo que contiene el valor que se retorna

        // caso 1: factor es un número
        if(factor.NUMERO() != null){
            if(tipo_funcion != TipoDato.INT && tipo_funcion != TipoDato.DOUBLE){
                return false;
            }
        }

        // caso 2: factor es una variable
        if(factor.ID() != null){
            ID id = tablaSimbolos.buscarLocal(factor.ID().getText());
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
            if(funcion.getTipoDato() != tipo_funcion){
                return false;
            }
        }

        return true;
    }
	
}