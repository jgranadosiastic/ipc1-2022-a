/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.calculadora.ui;

import java.util.Scanner;

/**
 *
 * @author marito
 */
public class CalculadoraUI {
    
    private Scanner scanner = new Scanner(System.in);
    private Scanner string = new Scanner(System.in);

    public double obtenerNumero1() {
        System.out.println("Ingrese el primer numero");
        return scanner.nextDouble();
    }

    public double obtenerNumero2() {
        System.out.println("Ingrese el segundo numero");
        return scanner.nextDouble();
    }

    public void mostrarResultado(double resultado) {
        //scanner.remove();
        System.out.println("El resultado es: " + resultado + "!");
    }

    public String obtenerOpcion() {
        System.out.println("Ingrese opción a realizar");
        System.out.println("\t1. Sumar");
        System.out.println("\t2. Restar");
        System.out.println("\t3. Multiplicar");
        System.out.println("\t4. Dividir");
        System.out.println("\t0. Salir");
        return string.nextLine();
    }

    public void decirAdios() {
        System.out.println("Gracias por usar esta calculadora, Adios!");
    }
    
    public void saludar() {
        System.out.println("Bienvenido a nuestra Calculadora!");
    }
    
}
