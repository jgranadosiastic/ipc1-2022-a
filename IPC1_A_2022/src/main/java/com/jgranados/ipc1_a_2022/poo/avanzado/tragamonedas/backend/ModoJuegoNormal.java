/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.backend;

import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes.Campana;
import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes.Cereza;
import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes.Imagen;
import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes.Uva;
import java.util.Random;

/**
 *
 * @author jose
 */
public class ModoJuegoNormal extends ModoJuego {

    private static final int CANTIDAD_IMAGENES = 3;

    public ModoJuegoNormal(int saldoMonedas) {
        super(saldoMonedas);
    }

    @Override
    public Imagen[] obtenerImagenes() {
        Imagen[] imagenes = new Imagen[CANTIDAD_IMAGENES];
        for (int i = 0; i < CANTIDAD_IMAGENES; i++) {
            imagenes[i] = generarImagen();
        }

        return imagenes;
    }

    @Override
    public int obtenerGanancia(int apuesta, Imagen[] imagenes) {
        int ganancia;
        if (imagenes[0] instanceof Campana && imagenes[1] instanceof Campana && imagenes[2] instanceof Campana) {
            ganancia = 10 * apuesta;
        } else if (imagenes[0] instanceof Uva && imagenes[1] instanceof Uva && imagenes[2] instanceof Uva) {
            ganancia = 7 * apuesta;
        } else if (imagenes[0] instanceof Cereza && imagenes[1] instanceof Cereza && imagenes[2] instanceof Cereza) {
            ganancia = 5 * apuesta;
        } else if (imagenes[0] instanceof Cereza && imagenes[1] instanceof Cereza
                || imagenes[0] instanceof Cereza && imagenes[2] instanceof Cereza
                || imagenes[1] instanceof Cereza && imagenes[2] instanceof Cereza) {
            ganancia = 3 * apuesta;
        } else if (imagenes[0] instanceof Cereza
                || imagenes[1] instanceof Cereza
                || imagenes[2] instanceof Cereza) {
            ganancia = 1 * apuesta;
        } else {
            ganancia = -apuesta;
        }
        aplicarGanancia(ganancia);

        return ganancia;
    }

    private Imagen generarImagen() {
        Random random = new Random();
        int val = random.nextInt(100);
        if (val >= 0 && val < 33) {
            return new Campana();
        } else if (val >= 33 && val <= 67) {
            return new Uva();
        } else {
            return new Cereza();
        }
    }

}
