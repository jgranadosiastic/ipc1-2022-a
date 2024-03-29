package com.jgranados.ipc1_a_2022.poo.abstraccion;

/**
 *
 * @author jose
 */
public class Rectangulo {

    private int base;
    private int altura;
    
    public Rectangulo(int baseInicial, int alturaInicial) {
        base = baseInicial;
        altura = alturaInicial;
    }
    
    public Rectangulo() {
        base = 100;
        altura = 100;
    }
    
    public int calcularArea() {
        return base * altura;
    }
    
    public int calcularPerimetro() {
        return 2 * base + 2 * altura;
    }
    
    public int devolverBase() {
        return base;
    }
}
