package com.jgranados.ipc1_a_2022.poo.avanzado.interfaces;

/**
 *
 * @author jose
 */
public class Avion extends Vehiculo implements Volar {
    
    private int cajaNegra;

    @Override
    public void despegar() {
        System.out.println("despegando avion con caja negra");
    }
    
    
    @Override
    public void aterrizar() {
        System.out.println("aterrizando avion con caja negra");
    }
}
