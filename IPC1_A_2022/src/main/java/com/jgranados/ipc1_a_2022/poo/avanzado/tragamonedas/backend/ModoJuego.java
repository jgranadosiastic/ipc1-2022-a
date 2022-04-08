/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.backend;

import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes.Imagen;

/**
 *
 * @author jose
 */
public abstract class ModoJuego {
    private int saldoMonedas;

    public ModoJuego(int saldoMonedas) {
        this.saldoMonedas = saldoMonedas;
    }

    public int obtenerSaldo() {
        return saldoMonedas;
    }
    
    protected void aplicarGanancia(int ganancia) {
        saldoMonedas += ganancia;
    }
    
    public abstract Imagen[] obtenerImagenes();
    public abstract int obtenerGanancia(int apuesta, Imagen[] imagenes);
}
