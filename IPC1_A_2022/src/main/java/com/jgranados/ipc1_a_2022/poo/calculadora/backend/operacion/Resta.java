/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.calculadora.backend.operacion;

/**
 *
 * @author marito
 */
public class Resta extends Operacion {

    @Override
    public void operar() {
        super.resultado = super.numero1 - super.numero2;
    }
    
}
