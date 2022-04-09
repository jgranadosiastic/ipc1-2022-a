/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.poo.avanzado.threads;

/**
 *
 * @author jose
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        HiloSimpleContador tarea1 = new HiloSimpleContador(500, "rapido");
        HiloSimpleContador tarea2 = new HiloSimpleContador(1000, "lento");
        
        HiloTareaEspecial tareaEspecial1 = new HiloTareaEspecial(800, "especial1");
        Thread hiloRunnable = new Thread(tareaEspecial1);
        
        System.out.println("inicio tarea1");
        tarea1.start();
        System.out.println("inicio tarea2");
        tarea2.start();
        hiloRunnable.start();
        
        System.out.println("1");
        Thread.sleep(5000);
        System.out.println("2");
        Thread.sleep(5000);
        System.out.println("3");
        Thread.sleep(5000);
        System.out.println("4");
        Thread.sleep(5000);
        System.out.println("5");
        Thread.sleep(5000);
        System.out.println("6");
    }
    
}
