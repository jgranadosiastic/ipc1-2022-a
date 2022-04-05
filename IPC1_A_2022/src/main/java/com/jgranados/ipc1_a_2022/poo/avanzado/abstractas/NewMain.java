/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.poo.avanzado.abstractas;

/**
 *
 * @author jose
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FiguraGeometrica triangulo = new Triangulo(5, 3, 4, 4);
        System.out.println("Area: " + triangulo.calcularArea());
    }
    
}
