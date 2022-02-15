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
public class NotasMayoresMenores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantNotas;
        System.out.println("Cual sera la cantidad de notas que va a ingresar?");
        cantNotas = scanner.nextInt();

        String[] nombres = new String[cantNotas];
        int[] notas = new int[cantNotas];
        int[] notasMen = new int[cantNotas];
        int[] notasMay = new int[cantNotas];
        int cantMen = 0;
        int cantMay = 0;
        int notaMen = 100;
        int notaMay = 0;
        int i = 0;

        while (i < cantNotas) {
            System.out.println("Ingrese el nombre: ");
            nombres[i] = scanner.next();
            System.out.println("Ingrese nota: ");
            notas[i] = scanner.nextInt();

            if (notas[i] < notaMen) {
                cantMen = 0;
                notasMen[cantMen] = i;
                cantMen = cantMen + 1;
                notaMen = notas[i];
            } else if (notas[i] == notaMen) {
                notasMen[cantMen] = i;
                cantMen = cantMen + 1;
            }

            if (notas[i] > notaMay) {
                cantMay = 0;
                notasMay[cantMay] = i;
                cantMay = cantMay + 1;
                notaMay = notas[i];
            } else if (notas[i] == notaMay) {
                notasMay[cantMay] = i;
                cantMay = cantMay + 1;
            }
            i = i + 1;
        }

        i = 0;
        System.out.println("Notas menores: ");
        while (i < cantMen) {
            System.out.println(nombres[notasMen[i]]);
            System.out.println(notas[notasMen[i]]);
            i = i + 1;
        }

        i = 0;
        System.out.println("Notas mayores: ");
        while (i < cantMay) {
            System.out.println(nombres[notasMay[i]]);
            System.out.println(notas[notasMay[i]]);
            i = i + 1;
        }
    }
    
}
