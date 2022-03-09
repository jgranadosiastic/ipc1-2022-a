package com.jgranados.ipc1_a_2022.poo.herencia;

/**
 *
 * @author jose
 */
public class BicicletaMontaña extends Bicicleta {

    private int amortiguadorFrontal;
    private int amortiguadorTrasero;
    
    public void absorberImpacto() {
        System.out.println("Absorbiendo impacto");
    }
}
