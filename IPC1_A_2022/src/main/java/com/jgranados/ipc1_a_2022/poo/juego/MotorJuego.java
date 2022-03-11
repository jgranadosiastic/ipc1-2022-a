package com.jgranados.ipc1_a_2022.poo.juego;

import com.jgranados.ipc1_a_2022.poo.juego.personajes.Jugador;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.Personaje;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos.Dragon;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos.Gargola;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos.Troll;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class MotorJuego {

    private Jugador jugador;
    private boolean seDaranFlechas;
    private boolean seCrearaEnemigo;

    public MotorJuego() {
        jugador = new Jugador();
        seDaranFlechas = false;
        seCrearaEnemigo = false;
    }

    /**
     * Registramos el avance del jugador
     */
    public void registrarAvance() {
        System.out.println("Avanzamos...");
    }

    /**
     * Crea enemigo en base a las probabilidades siguientes: 40% prob de crear
     * Troll 40% prob de crear Gorgola 20% prob de crear dragon
     *
     * @return
     */
    public Personaje generarEnemigo() {
        Random random = new Random();
        int val = random.nextInt(100);

        if (val >= 0 && val < 39) {
            return new Troll();
        } else if (val >= 40 && val < 79) {
            return new Gargola();
        } else {
            return new Dragon();
        }
    }

    public int generarFlechas() {
        Random random = new Random();
        int cantidadFlechas = random.nextInt(6) + 2;
        return cantidadFlechas;
    }

    public void jugar() {
        while (jugador.estaVivo()) {
            seDaranFlechas = decidirDarFlechas();
            seCrearaEnemigo = decidirCrearEnemigo();

            if (seCrearaEnemigo) {
                // crear pelea
                System.out.println("crear pelea");
            } else {
                if (seDaranFlechas) {
                    System.out.println("Encontraste flechas...");
                }
                usarOpciones();
            }

        }
        System.out.println("Te han derrotado...");
    }

    private void usarOpciones() {
        System.out.println("Opciones");
        System.out.println("1. Avanzar");
        if (seDaranFlechas) {
            System.out.println("2. Recoger flechas");
        }
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                registrarAvance();
                break;
            case 2:
                darFlechas();
                break;
            default:
                System.out.println("Perdiste tu turno!!!!");
        }
    }

    /**
     * Se tiene 50% de probabilidad de dar flechas
     *
     * @return
     */
    private boolean decidirDarFlechas() {
        Random random = new Random();
        int val = random.nextInt(100);
        return val >= 49;
    }

    /**
     * Se tiene 40% de probabilidad de crear enemigo
     *
     * @return
     */
    private boolean decidirCrearEnemigo() {
        Random random = new Random();
        int val = random.nextInt(100);
        return val >= 59;
    }

    /**
     * Entrega las flechas al jugador
     */
    private void darFlechas() {
        int cantidad = generarFlechas();
        System.out.println(String.format("Se dieron al jugador %d flechas", cantidad));
        jugador.recogerFlechas(cantidad);
    }
}
