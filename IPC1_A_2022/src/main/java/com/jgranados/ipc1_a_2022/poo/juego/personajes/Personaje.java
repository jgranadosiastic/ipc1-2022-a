package com.jgranados.ipc1_a_2022.poo.juego.personajes;

import java.util.Random;

/**
 *
 * @author jose
 */
public class Personaje {
    protected int puntosDeDefensaInferior;
    protected int puntosDeDefensaSuperior;
    protected int puntosDeVida;
    
    public int recibirAtaque(int daño) {
        int dañoFinal = daño - calcularDefensa();
        dañoFinal = dañoFinal >= 0 ? dañoFinal : 0;
        puntosDeVida -= dañoFinal;
        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
        return dañoFinal;
    }
    
    public boolean estaVivo() {
        return puntosDeVida > 0;
    }
    
    public int obtenerPuntosDeVida() {
        return puntosDeVida;
    }
    
    private int calcularDefensa() {
        Random random = new Random();
        return random.nextInt((puntosDeDefensaSuperior - puntosDeDefensaInferior) + 1) + puntosDeDefensaInferior;
    }
}
