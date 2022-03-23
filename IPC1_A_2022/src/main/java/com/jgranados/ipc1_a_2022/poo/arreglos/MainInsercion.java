/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.poo.arreglos;

/**
 *
 * @author jose
 */
public class MainInsercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArregloOrdenadoPorInsercion arregloOrdenado = new ArregloOrdenadoPorInsercion(6);
        arregloOrdenado.agregarLibro("a", "Jose Granados", "POO", "Propio");
        arregloOrdenado.imprimirArreglo();
        System.out.println("Siguiente insercion");
        arregloOrdenado.agregarLibro("f", "Pedro Ramirez", "Pre calculo", "Editorial Mate");
        arregloOrdenado.imprimirArreglo();System.out.println("Siguiente insercion");
        System.out.println("Siguiente insercion");
        arregloOrdenado.agregarLibro("e", "Maria Fernandez", "Fisica fundamental", "Editorial Fisica");
        arregloOrdenado.imprimirArreglo();
        System.out.println("Siguiente insercion");
        arregloOrdenado.agregarLibro("i", "Rosa Cajas", "Quimica 1", "Editorial Quimica");
        arregloOrdenado.imprimirArreglo();
        System.out.println("Siguiente insercion");
        arregloOrdenado.agregarLibro("z", "Maria Fernandez", "Fisica fundamental", "Editorial Fisica");
        arregloOrdenado.imprimirArreglo();
        System.out.println("Siguiente insercion");
        arregloOrdenado.agregarLibro("b", "Bryan Mendoza", "Fisica fundamental", "Editorial Fisica");
        arregloOrdenado.imprimirArreglo();
    }
    
}
