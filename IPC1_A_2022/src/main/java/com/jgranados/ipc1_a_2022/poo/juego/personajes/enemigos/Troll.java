package com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos;

import com.jgranados.ipc1_a_2022.poo.juego.armas.Arma;

/**
 *
 * @author jose
 */
public class Troll extends Enemigo {
    
    public Troll() {
        puntosDeDefensaInferior = 1;
        puntosDeDefensaSuperior = 3;
        puntosDeVida = 20;
        arma = new Arma(1, 3);
    }
}
