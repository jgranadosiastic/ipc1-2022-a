package com.jgranados.ipc1_a_2022.poo.herencia;

/**
 *
 * @author jose
 */
public class BicicletaVelocidad extends Bicicleta {

    public void frenar() {
        System.out.println("la bicicleta de velocidad está frenando");
        System.out.println("de forma especial para las bicicletas de velocidad");
        cambiarVelocidad(0);
        velocidad = 0;
    }
    
    public void frenarDespacio() {
        System.out.println("la bicicleta de velocidad está frenando Despacio");
    }
}
