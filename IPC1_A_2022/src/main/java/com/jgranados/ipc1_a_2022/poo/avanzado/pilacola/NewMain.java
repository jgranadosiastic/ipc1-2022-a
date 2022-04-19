/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.poo.avanzado.pilacola;

import com.jgranados.ipc1_a_2022.poo.arreglos.Libro;
import com.jgranados.ipc1_a_2022.poo.avanzado.abstractas.Triangulo;
import javax.swing.JButton;

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
        Triangulo t = new Triangulo(0, 0, 0, 0);
        
        //Pila pilaDeLibros = new Pila(5):Libro;\
        Pila<Libro> pilaDeLibros = new Pila<>(5);
        //Pila pilaDeBotones = new Pila(10):JButton;
        Pila<JButton> pilaDeBotones = new Pila<>(2);
        
        try {
            pila.desapilar();
        } catch (PilaException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            pila.apilar(new Libro("a", "autor A", "Pre calculo", "editorial"));
            pila.apilar(new Libro("b", "autor B", "Quimica", "editorial"));
            pila.apilar(new Libro("c", "autor C", "Tecnicas complementarias", "editorial"));
            
            
            pilaDeLibros.apilar(new Libro("a", "autor A", "Pre calculo", "editorial"));
            pilaDeLibros.apilar(new Libro("b", "autor B", "Quimica", "editorial"));
            pilaDeLibros.apilar(new Libro("c", "autor C", "Tecnicas complementarias", "editorial"));
            
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
            
            libro = pilaDeLibros.desapilar();
            libro.imprimirDatos();
            libro = pilaDeLibros.desapilar();
            libro.imprimirDatos();
            libro = pilaDeLibros.desapilar();
            libro.imprimirDatos();
            
        } catch (PilaException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
