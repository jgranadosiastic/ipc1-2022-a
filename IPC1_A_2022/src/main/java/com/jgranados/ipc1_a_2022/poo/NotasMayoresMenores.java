/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.poo;

import com.jgranados.ipc1_a_2022.*;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class NotasMayoresMenores {

    private String[] nombres;
    private int[] notas;
    private int[] notasMen;
    private int[] notasMay;
    private int cantMen = 0;
    private int cantMay = 0;
    private int notaMen = 100;
    private int notaMay = 0;
    private int i = 0;
    private int cantNotas;

    public NotasMayoresMenores(int cantNotas) {
        nombres = new String[cantNotas];
        notas = new int[cantNotas];
        notasMen = new int[cantNotas];
        notasMay = new int[cantNotas];
        this.cantNotas = cantNotas;
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantNotas;
        System.out.println("Cual sera la cantidad de notas que va a ingresar?");
        cantNotas = scanner.nextInt();
        NotasMayoresMenores notas = new NotasMayoresMenores(cantNotas);
        notas.ejecutar();
    }

}
