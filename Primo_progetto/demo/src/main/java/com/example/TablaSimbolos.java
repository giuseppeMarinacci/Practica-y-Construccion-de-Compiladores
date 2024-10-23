package com.example;

import java.util.*;

public class TablaSimbolos {

    private List<Contexto> contextos = new ArrayList<>();
    private static TablaSimbolos instancia;

    private TablaSimbolos() {
        contextos = new ArrayList<>();
    }

    public static TablaSimbolos getInstance() {
        if (instancia == null) {
            instancia = new TablaSimbolos();
        }
        return instancia;
    }

    public void addContexto() {
        contextos.add(new Contexto());
    }

    public void delContexto() {
        if (!contextos.isEmpty()) {
            contextos.remove(contextos.size() - 1);
        }
    }

    public void addIdentificador(ID id) {
        if (!contextos.isEmpty()) {
            contextos.get(contextos.size() - 1).addId(id);
        }
    }

    public ID buscarLocal(String nombre) {
        if (!contextos.isEmpty()) {
            return contextos.get(contextos.size() - 1).getId(nombre);
        }
        return null;
    }

    public ID buscarGlobal(String nombre) {
        for (int i = contextos.size() - 1; i >= 0; i--) {
            ID id = contextos.get(i).getId(nombre);
            if (id != null) {
                return id;
            }
        }
        return null;
    }
}

class Contexto {

    private Map<String, ID> simbolos = new HashMap<>();

    public ID getId(String nombre) {
        return simbolos.get(nombre);
    }

    public void addId(ID id) {
        simbolos.put(id.getNombre(), id);
    }
}

abstract class ID {

    protected String nombre;
    protected TipoDato tdato;
    protected boolean inicializado;
    protected boolean usado;

    public ID(String nombre, TipoDato tdato) {
        this.nombre = nombre;
        this.tdato = tdato;
        this.inicializado = false;
        this.usado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setInicializado() {
        this.inicializado = true;
    }

    public void setUsado() {
        this.usado = true;
    }
}

enum TipoDato {
    INT,
    DOUBLE,
    CHAR,
    VOID;

    public static TipoDato fromString(String s) {
        switch (s) {
            case "int":
                return INT;
            case "double":
                return DOUBLE;
            case "char":
                return CHAR;
            case "void":
                return VOID;
            default:
                return null;
        }
    }
}


class Variable extends ID {

    public Variable(String nombre, TipoDato tdato) {
        super(nombre, tdato);
    }
}

class Funcion extends ID {

    private List<TipoDato> args;

    public Funcion(String nombre, TipoDato tdato, List<TipoDato> args) {
        super(nombre, tdato);
        this.args = args;
    }

    public List<TipoDato> getArgs() {
        return args;
    }
}
