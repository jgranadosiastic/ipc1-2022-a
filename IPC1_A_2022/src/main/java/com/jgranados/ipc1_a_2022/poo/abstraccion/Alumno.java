package com.jgranados.ipc1_a_2022.poo.abstraccion;

/**
 *
 * @author jose
 */
public class Alumno {

    private String cui;
    private String nombre;
    private int[] notas;

    public Alumno(String cuiInicial, String nombreInicial) {
        cui = cuiInicial;
        nombre = nombreInicial;
        notas = new int[3];
    }
    
    public void agregarNota(int index, int nota) {
        notas[index] = nota;
    }
    
    public int calcularPromedioFinal() {
        int promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            promedio = promedio + notas[i];
        }

        return promedio / notas.length;
    }

    public boolean serAprobado() {
        int notaPromedio = calcularPromedioFinal();
        return notaPromedio >= 61;
    }

    public void imprimirResumenDatos() {
        int promedioFinal = calcularPromedioFinal();
        System.out.println("DATOS DEL ESTUDIANTE");
        System.out.println("CUI: " + cui);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota promedio: " + promedioFinal);
        if (serAprobado()) {
            System.out.println("El estudiante si aprobó");
        } else {
            System.out.println("El estudiante no aprobó");
        }
    }
    
    public void especificarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
}

