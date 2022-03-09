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
public class MainAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el CUI del estudiante");
        String cui = scanner.next();
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = scanner.next();
        
        Alumno estudiante = new Alumno(cui, nombre);
        
        int nota;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + (i + 1));
            nota = scanner.nextInt();
            estudiante.agregarNota(i, nota);
        }
        
        estudiante.imprimirResumenDatos();
        estudiante.especificarNombre("ssssss");
        estudiante.imprimirResumenDatos();
    }
    
}
