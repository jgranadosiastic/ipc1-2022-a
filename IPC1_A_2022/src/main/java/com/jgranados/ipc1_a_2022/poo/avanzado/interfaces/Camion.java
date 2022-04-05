package com.jgranados.ipc1_a_2022.poo.avanzado.interfaces;

/**
 *
 * @author jose
 */
public class Camion extends Vehiculo implements Bocinar {
    
    @Override
    public void bocinar(int segundos) {
        System.out.println("Bocinar desde camion " + segundos + " segundos");
    }

}
