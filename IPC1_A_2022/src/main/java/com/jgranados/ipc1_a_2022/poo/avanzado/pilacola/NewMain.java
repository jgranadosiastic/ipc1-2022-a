/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.poo.avanzado.pilacola;

import com.jgranados.ipc1_a_2022.poo.arreglos.Libro;

/**
 *
 * @author jose
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaLibros pila = new PilaLibros(5);
        try {
            pila.desapilar();
        } catch (PilaException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            pila.apilar(new Libro("a", "autor A", "Pre calculo", "editorial"));
            pila.apilar(new Libro("b", "autor B", "Quimica", "editorial"));
            pila.apilar(new Libro("c", "autor C", "Tecnicas complementarias", "editorial"));
        } catch (PilaException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            Libro libro = pila.desapilar();
            libro.imprimirDatos();
            libro = pila.desapilar();
            libro.imprimirDatos();
            libro = pila.desapilar();
            libro.imprimirDatos();
        } catch (PilaException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
