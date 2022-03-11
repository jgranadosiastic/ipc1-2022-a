package com.jgranados.ipc1_a_2022.poo.juego;

import com.jgranados.ipc1_a_2022.poo.juego.personajes.Jugador;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.Personaje;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos.Enemigo;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Pelea {

    private Jugador jugador;
    private Enemigo enemigo;
    private boolean turno;

    public Pelea(Jugador jugador, Enemigo enemigo) {
        jugador = jugador;
        enemigo = enemigo;
    }

    public void iniciarPelea() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        definirPersonajeInicial();
        do {
            Personaje personajeAtaca = obtenerPersonajeAtaca();
            Personaje personajeAtacado = obtenerPersonajeAtacado();
            if (esTurnoJugador()) {
                mostrarOpcionesJugador();
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        jugador.atacarEspada(personajeAtacado);
                        break;
                    case 2:
                        jugador.atacarArco(personajeAtacado);
                        break;
                    default:
                        System.out.println("Perdiste tu turno!!!!");
                }
            } else {
                personajeAtaca.atacar(personajeAtado);
            }

            cambiarTurno();
        } while (noHayDerrotado());
    }

    private void mostrarOpcionesJugador() {
        System.out.println("Con que desea atacar?");
        System.out.println("1. Espada");
        System.out.println("2. Arco");
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
