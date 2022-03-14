package com.jgranados.ipc1_a_2022.poo.juego.armas;

import com.jgranados.ipc1_a_2022.poo.juego.personajes.Personaje;
import java.util.Random;

/**
 *
 * @author jose
 */
public class Arma {
    // 5-8
    // (0- 3) + 5
    private int dañoInferior;
    private int dañoSuperior;
    
    public Arma(int dañoInferior, int dañoSuperior) {
        this.dañoInferior = dañoInferior;
        this.dañoSuperior = dañoSuperior;
    }
    
    public Arma() {
        
    }
    
    public int calcularDaño (Personaje personajeAtacado) {
        Random random = new Random();
        return random.nextInt((dañoSuperior - dañoInferior) + 1) + dañoInferior;
    }
}
