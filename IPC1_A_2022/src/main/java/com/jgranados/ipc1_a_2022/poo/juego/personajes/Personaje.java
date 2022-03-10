package com.jgranados.ipc1_a_2022.poo.juego.personajes;

/**
 *
 * @author jose
 */
public class Personaje {
    private int puntosDeDefensa;
    private int puntosDeVida;

    public Personaje() {
        puntosDeVida = 50;
        puntosDeDefensa = 5;
    }
    
    public void atacar() {
        
    }
    
    public void recibirAtaque() {
        
    }
    
    public boolean estaVivo() {
        return puntosDeVida > 0;
    }
    
    
}
