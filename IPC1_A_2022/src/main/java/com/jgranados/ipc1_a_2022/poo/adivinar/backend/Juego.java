/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.adivinar.backend;

import com.jgranados.ipc1_a_2022.poo.adivinar.backend.jugador.Jugador;


/**
 *
 * @author marito
 */
public class Juego {
    
    private Jugador A, B;
    private final boolean empiezaA = true;
    private int turno = 0;
    public static final int rondas = 3;
    public static final int tope = 9;
    public static final int comienzo = 0;
    
    public void empezar() {
        A = new Jugador(empiezaA, 'A');
        B =  new Jugador(!empiezaA, 'B');
    }
    
    public Jugador getEscogiendo() {
        if(A.isEscogiendo()){
            return A;
        }
        return B;
    }
    
    public Jugador getAdivinando() {
        if(A.isEscogiendo()){
            return B;
        }
        return A;
    }

    public int getTurno() {
        return turno;
    }

    public void addTurno() {
        this.turno++;
        A.setEscogiendo(!A.isEscogiendo());
        B.setEscogiendo(!B.isEscogiendo());
    }

    public Jugador obtenerGanador() {
        if(A.getPunteo()>B.getPunteo()) {
            return A;
        } else if(B.getPunteo()>A.getPunteo()) {
            return B;
        }
        return null;
    }
    
}
