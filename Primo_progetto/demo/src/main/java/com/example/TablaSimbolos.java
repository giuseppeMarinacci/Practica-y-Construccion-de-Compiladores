package com.example;

import java.util.*;
import java.io.*;

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

    public void delContexto(String absoluteFilePath) {
        if (!contextos.isEmpty()) {
            contextos.get(contextos.size() - 1).imprimirContexto(absoluteFilePath);
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

    public void imprimirContexto(String absoluteFilePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(absoluteFilePath, true))) {
            // cabecera
            writer.write("\n---------------- Contexto ----------------\n");
            writer.write(String.format("%-15s%-10s%-10s%-16s", "NAME", "TYPE", "USED", "INITIALIZED"));
            writer.write("\n---------------------------------------------------\n");
            
            // contenido
            for (ID id : simbolos.values()) {
                String name = id.getNombre();
                TipoDato type = id.getTipoDato();
                String used = String.valueOf(id.getUsado());
                String initialized = String.valueOf(id.getInicializado());

                writer.write(String.format("%-15s%-10s%-10s%-18s\n", name, type, used, initialized));
            }
        } catch (Exception e) {
            System.out.println("Unable to write file: " + absoluteFilePath);
        }
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

    public TipoDato getTipoDato() {
        return tdato;
    }

    public boolean getInicializado() {
        return this.inicializado;
    }

    public void setInicializado() {
        this.inicializado = true;
    }

    public boolean getUsado() {
        return this.usado;
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

    private LinkedList<Variable> args;

    public Funcion(String nombre, TipoDato tdato, LinkedList<Variable> args) {
        super(nombre, tdato);
        this.args = args;
    }

    public LinkedList<Variable> getArgs() {
        return args;
    }
}
