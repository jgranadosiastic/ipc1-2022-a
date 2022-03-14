package com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos;

import com.jgranados.ipc1_a_2022.poo.juego.armas.Arma;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.Personaje;

/**
 *
 * @author jose
 */
public class Enemigo extends Personaje {
    protected Arma arma;
    protected boolean volando;

    public Enemigo() {
        volando = false;
    }
    
    public int atacar(Personaje personajeAtacado) {
        return personajeAtacado.recibirAtaque(arma.calcularDaño(personajeAtacado));
    }
    
    public boolean estaVolando() {
        return volando;
    }
}
