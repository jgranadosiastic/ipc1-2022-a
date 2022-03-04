package com.jgranados.ipc1_a_2022.poo.abstraccion;

/**
 *
 * @author jose
 */
// Upper Camel Case
public class Articulo {
    
    // Lower Camel Case, sustantivo
    double costoBase;
    
    // Lower Camel Case, verbo
    public double calcularPrecioDetalle() {
        // Var incremento
        // incremento = 0.3 * costoBase
        // Var precio = incremento + costoBase
        
        double incremento;
        incremento = 0.3 * costoBase;
        return incremento + costoBase;        
    }
    
    public double calcularPrecioAlMayor() {
        double incremento;
        incremento = 0.15 * costoBase;
        return incremento + costoBase;        
    }
}
