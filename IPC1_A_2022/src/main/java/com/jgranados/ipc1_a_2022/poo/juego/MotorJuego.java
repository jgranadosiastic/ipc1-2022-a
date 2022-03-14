package com.jgranados.ipc1_a_2022.poo.juego;

import com.jgranados.ipc1_a_2022.poo.juego.personajes.Jugador;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.Personaje;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos.Dragon;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos.Enemigo;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos.Gargola;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos.Troll;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jose
 * public
 *      acceso desde cualquier clase
 * private
 *      acceso unicamente desde la propia clase
 * protected
 *      acceso desde la propia clase, desde clases hijas y desde
 *      clases en el mismo paquete
 * 
 * sin modificador
 *      acceso desde la propia clase y desde clases en el mismo paquete
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
    private void registrarAvance() {
        System.out.println("Avanzamos...");
        System.out.println("Presiona una tecla...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    /**
     * Crea enemigo en base a las probabilidades siguientes: 40% prob de crear
     * Troll 40% prob de crear Gorgola 20% prob de crear dragon
     *
     * @return
     */
    private Personaje generarEnemigo() {
        Random random = new Random();
        int val = random.nextInt(100);

        if (val >= 0 && val < 39) {
            System.out.println("Has encontrado un Troll!!!");
            return new Troll();
        } else if (val >= 40 && val < 79) {
            System.out.println("Has encontrado una Gargola!!!");
            return new Gargola();
        } else {
            System.out.println("Has encontrado un Dragon!!!");
            return new Dragon();
        }
    }

    private int generarFlechas() {
        Random random = new Random();
        int cantidadFlechas = random.nextInt(6) + 2;
        return cantidadFlechas;
    }

    public void jugar() {
        System.out.println("Iniciando juego...");
        System.out.println("Presione enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        while (jugador.estaVivo()) {
            seDaranFlechas = decidirDarFlechas();
            seCrearaEnemigo = decidirCrearEnemigo();

            if (seCrearaEnemigo) {
                Personaje enemigo = generarEnemigo();
                Pelea pelea = new Pelea(jugador, (Enemigo) enemigo);
                pelea.iniciarPelea();
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
        int opcion = Integer.valueOf(scanner.nextLine());

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
        System.out.println(String.format("Ahora tienes %d flechas", jugador.obtenerCantidadFlechas()));
    }
}
