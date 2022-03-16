/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.poo.arreglos;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro[] libros = new Libro[5];
        
        libros[0] = new Libro("a", "Jose Granados", "POO", "Propio");
        libros[1] = new Libro("d", "Pedro Ramirez", "Pre calculo", "Editorial Mate");
        libros[2] = new Libro("f", "Maria Fernandez", "Fisica fundamental", "Editorial Fisica");
        libros[3] = new Libro("z", "Rosa Cajas", "Quimica 1", "Editorial Quimica");
        libros[4] = new Libro("x", "Mario Cifuentes", "Compiladores", "Editorial compi");
        
        for (Libro libro : libros) {
            libro.imprimirDatos();
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el isbn a buscar:");
        String isbnABuscar = scanner.nextLine();
        buscarSecuencialmente(isbnABuscar, libros);
        
    }
    
    public static void buscarSecuencialmente(String isbnABuscar, Libro[] libros) {
        Libro libroEncontrado = null;
        for (Libro libro : libros) {
            if (libro.tieneISBN(isbnABuscar)) {
                libroEncontrado = libro;
                break;
            }
        }
        
        if (libroEncontrado != null) {
            System.out.println("Encontre el libro");
            libroEncontrado.imprimirDatos();
        } else {
            System.out.println("No se encontro el libro");
        }
    }
    
    
    
}
