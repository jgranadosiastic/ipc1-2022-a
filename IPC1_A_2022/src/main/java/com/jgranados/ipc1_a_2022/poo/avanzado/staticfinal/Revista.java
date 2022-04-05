package com.jgranados.ipc1_a_2022.poo.avanzado.staticfinal;

/**
 *
 * @author jose
 */
public /*final*/ class Revista {
    
    
    private String nombre;
    private final double precio;
    private int cantidadLecturas;
    private static int contadorVisitas = 1;

    public Revista(double precio) {
        this.precio = precio;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    public final void procesarDatos() {
        // hace algo
        System.out.println("hace algo.");
    }
    
    public static void aumentarVisitas() {
        contadorVisitas++;
    }
    
    public static int obtenerVisitas() {
        return contadorVisitas;
    }
}
