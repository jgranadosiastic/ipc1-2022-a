package com.jgranados.ipc1_a_2022.poo.avanzado.abstractas;

/**
 *
 * @author jose
 */
public class Triangulo extends FiguraGeometrica {

    private int altura;
    private int ladoBase;
    private int ladoA;
    private int ladoB;

    public Triangulo(int altura, int ladoBase, int ladoA, int ladoB) {
        this.altura = altura;
        this.ladoBase = ladoBase;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    
    @Override
    public float calcularArea() {
        return 0.5f * ladoBase * altura;
    }
    
    @Override
    public float calcularPerimetro() {
        return ladoA + ladoBase + ladoB;
    }
    
}
