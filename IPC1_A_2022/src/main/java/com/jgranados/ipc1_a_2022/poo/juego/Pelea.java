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
        this.jugador = jugador;
        this.enemigo = enemigo;
    }

    public void iniciarPelea() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int daño = 0;
        definirPersonajeInicial();
        System.out.println("Se inició la pelea...");
        System.out.println("Presiona enter para continuar");
        scanner.nextLine();
        do {
            Personaje personajeAtaca = obtenerPersonajeAtaca();
            Personaje personajeAtacado = obtenerPersonajeAtacado();
            if (esTurnoJugador()) {
                System.out.println("Es tu turno de atacar...");
                System.out.println(String.format("Tienes %d flechas", jugador.obtenerCantidadFlechas()));
                mostrarOpcionesJugador();
                opcion = Integer.valueOf(scanner.nextLine());
                
                switch (opcion) {
                    case 1:
                        daño = jugador.atacarEspada(personajeAtacado);
                        System.out.println(String.format("Hiciste %d puntos de daño", daño));
                        break;
                    case 2:
                        daño = jugador.atacarArco(personajeAtacado);
                        System.out.println(String.format("Hiciste %d puntos de daño", daño));
                        break;
                    default:
                        System.out.println("Perdiste tu turno!!!!");
                }
                System.out.println(String.format("El enemigo tiene %d puntos de vida", enemigo.obtenerPuntosDeVida()));
            } else {
                System.out.println("Es el turno de atacar del enemigo...");
                System.out.println("Presiona enter para continuar");
                scanner.nextLine();
                daño = ((Enemigo) personajeAtaca).atacar(personajeAtacado);
                System.out.println(String.format("El enemigo te hizo %d puntos de daño", daño));
                System.out.println(String.format("Te quedan %d puntos de vida", jugador.obtenerPuntosDeVida()));
                System.out.println("Presiona enter para continuar");
                scanner.nextLine();
            }

            cambiarTurno();
        } while (noHayDerrotado());
        System.out.println("Terminó la pelea");
        System.out.println("Presiona enter para continuar...");
        scanner.nextLine();
    }

    private void mostrarOpcionesJugador() {
        System.out.println("Con que deseas atacar?");
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
