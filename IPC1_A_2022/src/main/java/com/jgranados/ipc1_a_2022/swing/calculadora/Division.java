package com.jgranados.ipc1_a_2022.swing.calculadora;

/**
 *
 * @author jose
 */
public class Division extends Operacion {

    public Division(int numero1, int numero2) {
        super(numero1, numero2);
    }
    
    public int operar() {
        return numero1 / numero2;
    }

}
