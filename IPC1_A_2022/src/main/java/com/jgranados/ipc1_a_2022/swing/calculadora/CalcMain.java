/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.swing.calculadora;

/**
 *
 * @author jose
 */
public class CalcMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalcFrame calc = new CalcFrame();
        calc.setVisible(true);
        
        CalcTexto text = new CalcTexto();
        text.mostrar();
    }
    
}
