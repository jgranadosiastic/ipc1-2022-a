/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.calculadora.backend.operacion;

/**
 *
 * @author marito
 */
public abstract class Operacion {
    
    protected double numero1;
    protected double numero2;
    protected double resultado;
    
    public abstract void operar();

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }
    
}
