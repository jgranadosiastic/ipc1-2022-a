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
        libros[3] = new Libro("x", "Mario Cifuentes", "Compiladores", "Editorial compi");
        libros[4] = new Libro("y", "Rosa Cajas", "Quimica 1", "Editorial Quimica");
        
        for (Libro libro : libros) {
            libro.imprimirDatos();
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el isbn a buscar:");
        String isbnABuscar = scanner.nextLine();
        buscarSecuencialmente(isbnABuscar, libros);
        buscarBinario(isbnABuscar, libros);
        
    }
    
    public static void buscarSecuencialmente(String isbnABuscar, Libro[] libros) {
        Libro libroEncontrado = null;
        for (int i = 0; i < libros.length; i++) {
            Libro libro = libros[i];
            System.out.println("ciclo secuencial: " + (i + 1));
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
    
    public static void buscarBinario(String isbnABuscar, Libro[] libros) {
        int indiceInicial = 0;
        int indiceFinal = libros.length - 1;
        int puntoMedio;
        Libro libroEncontrado = null;
        int i = 0;
        
        while (indiceInicial <= indiceFinal) {
            System.out.println("ciclo binario: " + (i + 1));
            puntoMedio = (indiceFinal - indiceInicial) / 2;
            puntoMedio = puntoMedio + indiceInicial;
            Libro libro = libros[puntoMedio];
            if (libro.tieneISBN(isbnABuscar)) {
                libroEncontrado = libro;
                break;
            } else if (libro.obtenerISBN().compareToIgnoreCase(isbnABuscar) < 0) {
                // que el valor en punto medio es menor que lo buscado
                // por lo que me voy a la derecha
                indiceInicial = puntoMedio + 1;
            } else {
                // el valor en punto medio es mayor que lo buscado
                // por lo que me voy a la izquierda
                indiceFinal = puntoMedio - 1;
            }
            i++;
        }
        
        if (libroEncontrado != null) {
            System.out.println("Encontre el libro");
            libroEncontrado.imprimirDatos();
        } else {
            System.out.println("No se encontro el libro");
        }
    }
    
    
    
}
