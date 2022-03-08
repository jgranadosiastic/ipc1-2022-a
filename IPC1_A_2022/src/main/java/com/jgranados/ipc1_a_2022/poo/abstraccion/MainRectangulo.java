/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.poo.abstraccion;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class MainRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base");
        int base = scanner.nextInt();
        System.out.println("Ingrese la altura");
        int altura  = scanner.nextInt();
        
        Rectangulo rectangulo = new Rectangulo(base, altura);
        Rectangulo rectangulo2 = new Rectangulo();
        
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());
    }

}
