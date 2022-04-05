/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.poo.avanzado.staticfinal;

/**
 *
 * @author jose
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Revista revista = new Revista(100);
        //revista.procesarDatos();
        Revista revista2 = new Revista(200);
        
        System.out.println("revista 1: " + revista.getPrecio());
        System.out.println("revista 2: " + revista2.getPrecio());
        
        Revista.aumentarVisitas();
        System.out.println("revista 1: " + Revista.obtenerVisitas());
        System.out.println("revista 2: " + Revista.obtenerVisitas());
        
        System.out.println(25 * Impuesto.IVA);
    }
    
}
