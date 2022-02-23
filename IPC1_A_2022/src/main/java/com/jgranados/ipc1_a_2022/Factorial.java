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
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a calcular:");
        numero = scanner.nextInt();
        
        int factorial = factorialCiclos(numero);
        System.out.println(String.format("El factorial de %d es %d", numero, factorial));
        System.out.println("El factorial de " + numero + " es " + factorial);
        
        int factorialRec = factorialRecursivo(numero);
        System.out.println(String.format("El factorialrec de %d es %d", numero, factorialRec));
    }
    
    public static int factorialCiclos(int numero) {
        // obtener el numero base
        //var contador = 1
        //var factorial = 1
        // Desde 1 hasta numero base
        //  factorial = contador * factorial
        //  contador = contador + 1
        
        //findesde
        if (numero <= 0) {
            return 1;
        }
        int contador;
        int factorial = 1;
        for (contador = 1; contador <= numero; contador++) {
            factorial = contador * factorial;
        }
        
        return factorial;
        
    }
    
    public static int factorialRecursivo(int numero) {
        if (numero <= 0) {
            return 1;
        }
        int calculo = numero * factorialRecursivo(numero - 1);
        return calculo;
    }
    
}
