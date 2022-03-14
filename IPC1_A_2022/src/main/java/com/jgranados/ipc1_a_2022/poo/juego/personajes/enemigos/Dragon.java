package com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos;

import com.jgranados.ipc1_a_2022.poo.juego.armas.Arma;

/**
 *
 * @author jose
 */
public class Dragon extends Enemigo {
    
    public Dragon() {
        puntosDeDefensaInferior = 3;
        puntosDeDefensaSuperior = 6;
        puntosDeVida = 25;
        arma = new Arma(6, 10);
    }
    
    public void volar() {
        volando = true;
    }
    
    public void aterrizar() {
        volando = false;
    }
}
