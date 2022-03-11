package com.jgranados.ipc1_a_2022.poo.juego;

import com.jgranados.ipc1_a_2022.poo.juego.personajes.Jugador;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.Personaje;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos.Enemigo;
import java.util.Random;

/**
 *
 * @author jose
 */
public class Pelea {

    private Jugador jugador;
    private Enemigo enemigo;
    private boolean turno;

    public Pelea(Jugador jugador, Enemigo enemigo) {
        this.jugador = jugador;
        this.enemigo = enemigo;
    }

    public void iniciarPelea() {
        do {
            definirPersonajeInicial();
            Personaje personajeAtaca = obtenerPersonajeAtaca();
            Personaje personajeAtacado = obtenerPersonajeAtacado();
            if (esTurnoJugador()) {
                // mostrar opciones
            }

            cambiarTurno();
        } while (noHayDerrotado());
    }

    private void definirPersonajeInicial() {
        Random random = new Random();
        int val = random.nextInt(100);
        turno = val >= 49;
    }

    private Personaje obtenerPersonajeAtaca() {
        if (esTurnoJugador()) {
            return jugador;
        }
        
        return enemigo;
    }

    private Personaje obtenerPersonajeAtacado() {
        return esTurnoJugador() ? enemigo : jugador;
    }

    private boolean noHayDerrotado() {
        return jugador.estaVivo() && enemigo.estaVivo();
    }
    
    private boolean esTurnoJugador() {
        return turno;
    }
    
    private void cambiarTurno() {
        turno = !turno;
    }
}
