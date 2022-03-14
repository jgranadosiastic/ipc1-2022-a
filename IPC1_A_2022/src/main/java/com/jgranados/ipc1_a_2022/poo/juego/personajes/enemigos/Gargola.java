package com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos;

import com.jgranados.ipc1_a_2022.poo.juego.armas.Arma;

/**
 *
 * @author jose
 */
public class Gargola extends Enemigo {
    
    public Gargola() {
        puntosDeDefensaInferior = 1;
        puntosDeDefensaSuperior = 3;
        puntosDeVida = 20;
        arma = new Arma(1, 3);
        volando = true;
    }
}
