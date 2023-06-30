/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicioarbolesi;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author valen
 */

public class EjercicioArbolesI {

    public static void main(String[] args) {
        try {
            ArbolBinario arbol;
            Nodo a1, a2, a;
            PilaVector pila = new PilaVector();
            a1 = ArbolBinario.nuevoArbol(null, "Maria", null);
            a2 = ArbolBinario.nuevoArbol(null, "Rodrigo", null);
            a = ArbolBinario.nuevoArbol(a1, "Esperanza", a2);
            pila.insertar(a);
            a1 = ArbolBinario.nuevoArbol(null, "Anyora", null);
            a2 = ArbolBinario.nuevoArbol(null, "Abel", null);
            a = ArbolBinario.nuevoArbol(a1, "M Jesus", a2);
            pila.insertar(a);
            a2 = (Nodo) pila.quitar();
            a1 = (Nodo) pila.quitar();
            a = ArbolBinario.nuevoArbol(a1, "Esperanza", a2);
            arbol = new ArbolBinario(a);
            
            System.out.println("");
      System.out.println("Arbol Binario");
      arbol.imprimirArbol(arbol.raizArbol(), 0);
      System.out.println("");
      System.out.println(" PREORDEN ");
      System.out.println("");
      ArbolBinario.preorden(arbol.raizArbol());
      System.out.println("");
      System.out.println("");
      System.out.println(" ENORDEN ");
      System.out.println("");
      ArbolBinario.inorden(arbol.raizArbol());
      System.out.println("");
      System.out.println("");
      System.out.println("  POSTORDEN ");
      System.out.println("");
      ArbolBinario.postorden(arbol.raizArbol());
      System.out.println("");
        } catch (Exception e) {
            Logger.getLogger(EjercicioArbolesI.class.getName()).log(Level.SEVERE, null, e);
            
            
        }
    }
}
