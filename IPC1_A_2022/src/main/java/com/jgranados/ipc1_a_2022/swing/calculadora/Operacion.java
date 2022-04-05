package com.jgranados.ipc1_a_2022.swing.calculadora;

/**
 *
 * @author jose
 * Metodo Abstracto: la indicacion de que existe una accion,
 * pero no se sabe su logica (implmenentacino)
 * 
 * Metodo implementado: Es un metodo que ya posee una implementacion,
 * sobreescribiendo algun metodo abstracto o siendo un metodo que no es abstracto.
 * 
 * Metodo concreto: igual al anterior.
 */
public abstract class Operacion {
    
    protected int numero1;
    protected int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public abstract int operar();
    
    public void imprimirNumeros() {
        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);
    }
}
