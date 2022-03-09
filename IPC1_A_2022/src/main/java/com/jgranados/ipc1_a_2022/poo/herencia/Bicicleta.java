package com.jgranados.ipc1_a_2022.poo.herencia;

/**
 *
 * @author jose
 */
public class Bicicleta {

    protected int velocidad;
    private int revoluciones;
    private int velocidadCadena;
    
    public void frenarDespacio() {
        //xxxxxx
    }
    
    public void frenar() {
        System.out.println("la bicicleta está frenando");
        velocidad = 0;
        revoluciones = 0;
    }
    
    public void cambiarVelocidadCadena(int nuevaVelocidad) {
        System.out.println("se cambió la velocidad de cadena");
        velocidadCadena = nuevaVelocidad;
    }
    
    
    public void cambiarVelocidad(int nuevaVelocidad) {
        velocidad = nuevaVelocidad;
    }
}
