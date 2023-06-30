/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioarbolesi;

/**
 *
 * @author valen
 */
public class Nodo {
    protected Object dato;
    protected Nodo izdo;
    protected Nodo dcho;

    public Nodo(Object valor) {
        dato = valor;
        izdo = dcho = null;
    }

    public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho) {
        this(valor);
        izdo = ramaIzdo;
        dcho = ramaDcho;
    }

    public Object valorNodo() {
        return dato;
    }

    public Nodo subarbolIzdo() {
        return izdo;
    }

    public Nodo subarbolDcho() {
        return dcho;
    }

    public void nuevoValor(Object d) {
        dato = d;
    }

    public void ramaIzdo(Nodo n) {
        izdo = n;
    }

    public void ramaDcho(Nodo n) {
        dcho = n;
    }
}
