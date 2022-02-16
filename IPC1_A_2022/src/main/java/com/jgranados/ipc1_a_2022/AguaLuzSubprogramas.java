/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class AguaLuzSubprogramas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        double total;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Opciones:");
            System.out.println("1. Agua");
            System.out.println("2. Luz");
            System.out.println("3. Salir");
            System.out.println("Ingrese su opcion");

            opcion = scanner.nextInt();
            if (opcion == 1) {
                total = calcularAgua();
                calcularDescuento(total);
            } else if (opcion == 2) {
                total = calcularLuz();
                calcularDescuento(total);
            }
        } while (opcion != 3);
        System.out.println("Saliendo del sistema!!");
    }

    public static double calcularAgua() {
        Scanner scanner = new Scanner(System.in);
        int cantidad;
        double total = 0;
        int base = 20;

        System.out.println("Ingrese la cantidad de metros cubicos consumidos: ");
        cantidad = scanner.nextInt();

        if (cantidad > 0 && cantidad <= 5) {
            System.out.println("La cuota a pagar de agua es de: Q.");
            System.out.println(base);
        } else {
            if (cantidad > 5 && cantidad <= 15) {
                total = (cantidad * 5) + base;
                System.out.println("La cuota a pagar de agua es de: Q.");
                System.out.println(total);
            } else {
                total = (cantidad * 6.5) + base;
                System.out.println("La cuota a pagar de agua es de: Q.");
                System.out.println(total);
            }
        }
        
        return total;
    }

    public static double calcularLuz() {
        Scanner scanner = new Scanner(System.in);
        int cantidad;
        double total = 0;
        int extra;

        System.out.println("Ingrese la cantidad de kw/h consumidos: ");
        cantidad = scanner.nextInt();

        if (cantidad >= 1 && cantidad <= 50) {
            total = cantidad * 1;
            System.out.println("La cuota a pagar de luz es de: Q.");
            System.out.println(total);
        } else {
            if (cantidad > 50 && cantidad <= 100) {
                extra = cantidad - 50;
                total = 50 + extra * 1.5;
                System.out.println("La cuota a pagar de luz es de: Q.");
                System.out.println(total);
            } else {
                if (cantidad > 100) {
                    extra = cantidad - 100;
                    total = (extra * 2) + (50 - 1.5) + 50;
                    System.out.println("La cuota a pagar de luz es de: Q.");
                    System.out.println(total);
                }
            }
        }
        
        return total;
    }

    public static void calcularDescuento(double total) {
        double descuento;
        double nuevoTotal;
        
        if (total > 500) {
            descuento = total * 0.01;
            nuevoTotal = total - descuento;
            System.out.println("El total con descuento es: Q");
            System.out.println(nuevoTotal);
        }
    }
    
}
