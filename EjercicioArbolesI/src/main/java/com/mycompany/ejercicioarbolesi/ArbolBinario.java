/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioarbolesi;

/**
 *
 * @author valen
 */
public class ArbolBinario {
     protected Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo raizArbol() {
        return raiz;
    }
// Comprueba el estatus del árbol

    boolean esVacio() {
        return raiz == null;
    }

    public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha) {
        return new Nodo(ramaIzqda, dato, ramaDrcha);
    }

    static void preorden(Nodo r) {
        if (r != null) {
            System.out.print(r.dato + " ");
            preorden(r.subarbolIzdo());
            preorden(r.subarbolDcho());
        }
    }
// Recorrido de un árbol binario en inorden

    public static void inorden(Nodo r) {
        if (r != null) {
            inorden(r.subarbolIzdo());
            System.out.print(r.dato + " ");
            inorden(r.subarbolDcho());
        }
    }
// Recorrido de un árbol binario en postorden

    public static void postorden(Nodo r) {
        if (r != null) {
            postorden(r.subarbolIzdo());
            postorden(r.subarbolDcho());
            System.out.print(r.dato + " ");
        }

    }

    void imprimirArbol(Nodo nodo, int nivel) {
        if (nodo == null) {
            return;
        }

        imprimirArbol(nodo.dcho, nivel + 1);

        for (int i = 0; i < nivel; i++) {
            System.out.print("            ");
        }

        System.out.println("(" + nodo.dato + ")");

        imprimirArbol(nodo.izdo, nivel + 1);
    }
}
