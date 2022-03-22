/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.calculadora.backend;

import com.jgranados.ipc1_a_2022.poo.calculadora.backend.operacion.Resta;
import com.jgranados.ipc1_a_2022.poo.calculadora.backend.operacion.Division;
import com.jgranados.ipc1_a_2022.poo.calculadora.backend.operacion.Multiplicacion;
import com.jgranados.ipc1_a_2022.poo.calculadora.backend.operacion.Operacion;
import com.jgranados.ipc1_a_2022.poo.calculadora.backend.operacion.Suma;
import com.jgranados.ipc1_a_2022.poo.calculadora.ui.CalculadoraUI;

/**
 *
 * @author marito
 */
public class Calculadora {
    
    private Operacion operacion;
    private CalculadoraUI ui = new CalculadoraUI();
    
    public void empezarCalculadora() {
        ui.saludar();
        String opcion = ui.obtenerOpcion();
        //opcion 0 significa que no quiere realizar una operacion, y quiera salir del programa
        while(!opcion.equals("0")){
            switch (opcion) {
                case "1": // 1 representa suma
                    operacion = new Suma();
                    operar();
                    break;
                case "2": // 2 representa resta
                    operacion = new Resta();
                    operar();
                    break;
                case "3": // 3 representa multilicacion
                    operacion = new Multiplicacion();
                    operar();
                    break;
                case "4": // 4 representa division
                    operacion = new Division();
                    operar();
                    break;
                default:
                    System.out.println("Error en opcion");
                    break;
            }
            opcion = ui.obtenerOpcion();
        }
        ui.decirAdios();
    }
    
    public void operar(){
            operacion.setNumero1(ui.obtenerNumero1());
            operacion.setNumero2(ui.obtenerNumero2());
            operacion.operar();
            ui.mostrarResultado(operacion.getResultado());
    
    }
    
}
