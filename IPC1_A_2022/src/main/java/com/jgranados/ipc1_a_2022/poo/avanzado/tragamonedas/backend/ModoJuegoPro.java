/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.backend;

import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.backend.exception.TragamonedasException;
import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes.Campana;
import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes.CampanaHilo;
import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes.Cereza;
import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes.CerezaHilo;
import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes.Dolar;
import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes.DolarHilo;
import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes.Imagen;
import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes.ImagenHilo;
import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes.Uva;
import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes.UvaHilo;
import java.util.Random;

/**
 *
 * @author jose
 */
public class ModoJuegoPro extends ModoJuego {

    private static final int CANTIDAD_IMAGENES = 4;

    public ModoJuegoPro(int saldoMonedas) {
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
        if (imagenes[0] instanceof Campana && imagenes[1] instanceof Campana && imagenes[2] instanceof Campana && imagenes[3] instanceof Campana
                || imagenes[0] instanceof Uva && imagenes[1] instanceof Uva && imagenes[2] instanceof Uva && imagenes[3] instanceof Uva
                || imagenes[0] instanceof Cereza && imagenes[1] instanceof Cereza && imagenes[2] instanceof Cereza && imagenes[3] instanceof Cereza
                || imagenes[0] instanceof Dolar && imagenes[1] instanceof Dolar && imagenes[2] instanceof Dolar && imagenes[3] instanceof Dolar) {
            ganancia = 15 * apuesta;
        } else if (imagenes[0] instanceof Dolar && imagenes[2] instanceof Dolar
                || imagenes[1] instanceof Uva && imagenes[3] instanceof Uva
                || imagenes[0] instanceof Cereza && imagenes[3] instanceof Cereza
                || imagenes[0] instanceof Campana && imagenes[1] instanceof Campana) {
            ganancia = 7 * apuesta;
        } else if (imagenes[0] instanceof Dolar && imagenes[1] instanceof Uva && imagenes[2] instanceof Campana && imagenes[3] instanceof Cereza
                || imagenes[0] instanceof Dolar && imagenes[1] instanceof Campana && imagenes[2] instanceof Cereza && imagenes[3] instanceof Uva) {
            ganancia = 10 * apuesta;
        } else {
            ganancia = -apuesta;
        }
        aplicarGanancia(ganancia);

        return ganancia;
    }

    @Override
    public int obtenerGananciaManejoExcepciones(int apuesta, ImagenHilo[] imagenes) throws TragamonedasException {
        if (obtenerSaldo() < apuesta) {
            throw new TragamonedasException("No puedes apostar esa cantidad de monedas.");
        }
        int ganancia;
        if (imagenes[0] instanceof CampanaHilo && imagenes[1] instanceof CampanaHilo && imagenes[2] instanceof CampanaHilo && imagenes[3] instanceof CampanaHilo
                || imagenes[0] instanceof UvaHilo && imagenes[1] instanceof UvaHilo && imagenes[2] instanceof UvaHilo && imagenes[3] instanceof UvaHilo
                || imagenes[0] instanceof CerezaHilo && imagenes[1] instanceof CerezaHilo && imagenes[2] instanceof CerezaHilo && imagenes[3] instanceof CerezaHilo
                || imagenes[0] instanceof DolarHilo && imagenes[1] instanceof DolarHilo && imagenes[2] instanceof DolarHilo && imagenes[3] instanceof DolarHilo) {
            ganancia = 15 * apuesta;
        } else if (imagenes[0] instanceof DolarHilo && imagenes[2] instanceof DolarHilo
                || imagenes[1] instanceof UvaHilo && imagenes[3] instanceof UvaHilo
                || imagenes[0] instanceof CerezaHilo && imagenes[3] instanceof CerezaHilo
                || imagenes[0] instanceof CampanaHilo && imagenes[1] instanceof CampanaHilo) {
            ganancia = 7 * apuesta;
        } else if (imagenes[0] instanceof DolarHilo && imagenes[1] instanceof UvaHilo && imagenes[2] instanceof CampanaHilo && imagenes[3] instanceof CerezaHilo
                || imagenes[0] instanceof DolarHilo && imagenes[1] instanceof CampanaHilo && imagenes[2] instanceof CerezaHilo && imagenes[3] instanceof UvaHilo) {
            ganancia = 10 * apuesta;
        } else {
            ganancia = -apuesta;
        }
        aplicarGanancia(ganancia);

        return ganancia;
    }
    
    @Override
    public ImagenHilo[] obtenerImagenesManejoExcepciones() throws TragamonedasException {
        if (obtenerSaldo() <= 0) {
            throw new TragamonedasException("Ya no tienes saldo.");
        }
        
        ImagenHilo[] imagenes = new ImagenHilo[CANTIDAD_IMAGENES];
        for (int i = 0; i < CANTIDAD_IMAGENES; i++) {
            imagenes[i] = generarImagenHilo();
        }

        return imagenes;
    }

    private Imagen generarImagen() {
        Random random = new Random();
        int val = random.nextInt(100);
        if (val >= 0 && val < 26) {
            return new Campana();
        } else if (val >= 26 && val <= 51) {
            return new Uva();
        } else if (val >= 51 && val <= 75) {
            return new Uva();
        } else {
            return new Cereza();
        }
    }

    private ImagenHilo generarImagenHilo() {
        Random random = new Random();
        int val = random.nextInt(100);
        if (val >= 0 && val < 26) {
            return new CampanaHilo();
        } else if (val >= 26 && val <= 51) {
            return new UvaHilo();
        } else if (val >= 51 && val <= 75) {
            return new UvaHilo();
        } else {
            return new CerezaHilo();
        }
    }

}
