/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.adivinar.backend.jugador;

import com.jgranados.ipc1_a_2022.poo.adivinar.backend.Juego;


/**
 *
 * @author marito
 */
public class Jugador {
    
    private int numero;
    private boolean escogiendo;
    private char id;
    private int punteo = 0;

    public Jugador(boolean escogiendo, char id){
        this.escogiendo = escogiendo;
        this.id = id;
    }
    
    public int getNumero() {
        return numero;
    }

    public boolean setNumero(int numero) {
        if(numero >= Juego.comienzo && numero <= Juego.tope){
            this.numero = numero;
            return true;
        }
        return false;
    }

    public boolean isEscogiendo() {
        return escogiendo;
    }

    public void setEscogiendo(boolean escogiendo) {
        this.escogiendo = escogiendo;
    }

    public char getId() {
        return id;
    }

    public void sumarUno() {
        this.punteo++;
    }

    public int getPunteo() {
        return punteo;
    }
    
    @Override
    public String toString() {
        return ""+id;
    }
    
}
