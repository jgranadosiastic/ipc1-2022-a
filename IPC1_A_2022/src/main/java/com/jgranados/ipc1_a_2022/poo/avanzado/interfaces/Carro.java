package com.jgranados.ipc1_a_2022.poo.avanzado.interfaces;

/**
 *
 * @author jose
 */
public class Carro extends Vehiculo implements Volar, Bocinar, Cloneable {

    @Override
    public void despegar() {
        // despegar si tengo activo el poder
        System.out.println("despegando carro");
    }
    
    
    @Override
    public void aterrizar() {
        // aterrizar si tengo activo el poder
        System.out.println("aterrizando carro");
    }
    
    @Override
    public void bocinar(int segundos) {
        System.out.println("Bocinar desde carro " + segundos + " segundos");
    }
}
