package com.jgranados.ipc1_a_2022;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class NumerosPar {
    
    
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a calcular:");
        numero = scanner.nextInt();
        mostrarPares(numero);
    }
    
    public static int mostrarPares(int numero) {
        // validar que es par
        if (numero % 2 != 0) {
            System.out.println("El numero no es par");
            return -1;
        }
        System.out.println(numero);
        if (numero <= 0) {
            return numero;
        }
        return mostrarPares(numero - 2);
    }

}
