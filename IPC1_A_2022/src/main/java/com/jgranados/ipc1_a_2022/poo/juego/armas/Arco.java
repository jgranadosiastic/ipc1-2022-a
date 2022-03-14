package com.jgranados.ipc1_a_2022.poo.juego.armas;

import com.jgranados.ipc1_a_2022.poo.juego.personajes.Personaje;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos.Enemigo;
import java.util.Random;

/**
 *
 * @author jose
 */
public class Arco extends Arma {

    private int cantidadFlechas;
    private int dañoInferiorVolador;
    private int dañoSuperiorVolador;

    public Arco() {
        super(1, 3);
        dañoInferiorVolador = 5;
        dañoSuperiorVolador = 9;
        cantidadFlechas = 5;
    }

    public void agregarFlechas(int cantidad) {
        cantidadFlechas += cantidad;
    }

    @Override
    public int calcularDaño(Personaje personajeAtacado) {

        if (cantidadFlechas <= 0) {
            return 0;
        }
        cantidadFlechas--;
        if (personajeAtacado instanceof Enemigo && ((Enemigo) personajeAtacado).estaVolando()) {
            return calcularDañoVolador();
        }

        return super.calcularDaño(personajeAtacado);
    }

    private int calcularDañoVolador() {
        Random random = new Random();
        return random.nextInt((dañoSuperiorVolador - dañoInferiorVolador) + 1) + dañoInferiorVolador;
    }
    
    public int obtenerCantidadFlechas() {
        return cantidadFlechas;
    }
}
