/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.adivinar.ui;

import com.jgranados.ipc1_a_2022.poo.adivinar.backend.Juego;
import com.jgranados.ipc1_a_2022.poo.adivinar.backend.jugador.Jugador;
import java.util.Scanner;

/**
 *
 * @author marito
 */
public class JuegoUI {
    
    private final Juego juego;
    
    public JuegoUI() {
        juego = new Juego();
    }
    
    public void Jugar(){
        mostrarBienvenida();
        while(true){
            juego.empezar();
            while(juego.getTurno() < Juego.rondas*2){
                pedirNumero();
                limpiarPantalla();
                adivinarNumero();
                juego.addTurno();
            }
            mostrarGanador();
            String seguir = seguirJugando();
            if(!seguir.equals("1")) {
                break;
            }
        }
    }

    @SuppressWarnings("empty-statement")
    private void pedirNumero() {
        Jugador escogiendo = juego.getEscogiendo();
        System.out.println("Jugador " + escogiendo.getId() + " escoja su número del 0 al 9");
        Scanner scann = new Scanner(System.in);
        while(!escogiendo.setNumero(scann.nextInt())){
            System.out.println("Escoja de nuevo su número, esta fuera del rango permitido.");
        }
    }

    private void adivinarNumero() {
        Jugador adivinando = juego.getAdivinando();
        Jugador escogiendo = juego.getEscogiendo();
        for (int i = 0; i < 3; i++) {
            System.out.println("Jugador " + adivinando.getId() + " escoja un número del 0 al 9");
            Scanner scann = new Scanner(System.in);
            int numero = scann.nextInt();
            if(escogiendo.getNumero() == numero) {
                System.out.println("Ha adivinado el número! Felicidades");
                adivinando.sumarUno();
                break;
            } else {
                System.out.println("No ha adivinado el número en el intento " + (i+1));
            }
        }
    }

    private void mostrarBienvenida() {
        System.out.println("Bienvenido al juego, vamos a empezar!");
        System.out.println("El siguiente juego se trata sobre adivinar el número\n"
                + "-.El jugador A empezará escogiendo un número\n"
                + "-.El jugador que este escogiendo podrá escoger un número del 0 al 9"
                + "-.El jugador B empezará adivinando el número del Jugador A\n"
                + "-.El jugador que este adivinando tendra tres intentos\n"
                + "-.Se intercambian los roles al adivinar o al terminar los intentos\n"
                + "-.Este proceso se realizará 3 veces.");
    }

    private void mostrarGanador() {
        Jugador ganador = juego.obtenerGanador();
        if(ganador == null) {
            System.out.println("Los dos jugadores han empatado!!!");
        } else {
            System.out.println("El ganador de este juego a " + Juego.rondas + "rondas, es: " + ganador);
        }
    }

    private String seguirJugando() {
        Scanner scann = new Scanner(System.in);
        System.out.println("Quiere seguir jugando?. 1. Seguir, cualquier otro caracter es salir.");
        return scann.nextLine();
    }

    private void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }
    
}
