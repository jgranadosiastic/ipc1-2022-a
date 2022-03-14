package com.jgranados.ipc1_a_2022.poo.juego.armas;

import com.jgranados.ipc1_a_2022.poo.juego.personajes.Personaje;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos.Enemigo;
import java.util.Random;

/**
 *
 * @author jose
 */
public class Espada extends Arma {

    public Espada() {
        super(5, 8);
    }

    @Override
    public int calcularDaño(Personaje personajeAtacado) {

        if (personajeAtacado instanceof Enemigo && ((Enemigo) personajeAtacado).estaVolando()) {
            return 0;
        }

        return super.calcularDaño(personajeAtacado);
    }

}
