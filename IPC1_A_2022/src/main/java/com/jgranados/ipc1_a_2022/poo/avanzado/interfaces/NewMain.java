/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.poo.avanzado.interfaces;

/**
 *
 * @author jose
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Volar[] vehiculosVoladores = new Volar[5];
        
        Carro carro1 = new Carro();
        Avion avion1 = new Avion();
        Camion camion1 = new Camion();
        
        //vehiculosVoladores[0] = camion1;
        vehiculosVoladores[0] = avion1;
        vehiculosVoladores[1] = carro1;
        
        carro1.aterrizar();
        carro1.bocinar(5);
        carro1.avanzar();
        camion1.bocinar(7);
        camion1.avanzar();
        avion1.despegar();
        avion1.aterrizar();
        
        for (Volar vehiculoVolador : vehiculosVoladores) {
            if (vehiculoVolador != null && vehiculoVolador instanceof Vehiculo) {
                ((Vehiculo) vehiculoVolador).avanzar();
            }
        }
        
        
        // TODO code application logic here
    }
    
}
