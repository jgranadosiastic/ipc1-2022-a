/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.poo.herencia;

/**
 *
 * @author jose
 */
public class MainBicicleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BicicletaMontaña[] arregloMontaña = new BicicletaMontaña[2];
        BicicletaVelocidad[] arregloVelocidad = new BicicletaVelocidad[2];
        Bicicleta[] arregloBicicletas = new Bicicleta[4];
        
        BicicletaMontaña bicicletaMontaña = new BicicletaMontaña();
        BicicletaMontaña bicicletaMontaña2 = new BicicletaMontaña();
        BicicletaVelocidad bicicletaVelocidad = new BicicletaVelocidad();
        BicicletaVelocidad bicicletaVelocidad2 = new BicicletaVelocidad();
        
        arregloBicicletas[0] = bicicletaMontaña;
        arregloBicicletas[1] = bicicletaMontaña2;
        
        /*
        arregloMontaña[0] = bicicletaMontaña;
        arregloMontaña[1] = bicicletaMontaña2;
                
        arregloVelocidad[0] = bicicletaVelocidad;
        arregloVelocidad[1] = bicicletaVelocidad2;
        */
        arregloBicicletas[2] = bicicletaVelocidad;
        arregloBicicletas[3] = bicicletaVelocidad2;
                
        bicicletaMontaña.cambiarVelocidad(25);
        bicicletaMontaña.frenar();
        
        bicicletaVelocidad.cambiarVelocidadCadena(3);
        bicicletaVelocidad.frenar();
        System.out.println("--------------------------");
        for (Bicicleta bici : arregloBicicletas) {
            bici.frenar();
        }
        
        
    }
    
}
