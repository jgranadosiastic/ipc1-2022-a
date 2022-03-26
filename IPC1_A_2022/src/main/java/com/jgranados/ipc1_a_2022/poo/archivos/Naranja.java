/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.archivos;

/**
 *
 * @author marito
 */
public class Naranja extends Fruta {
    
    public Naranja(double precio) {
        super(precio);
    }
    
    @Override
    public String escribir() {
        return "naranja,"+super.escribir();
    }
    
    public static Naranja crearNaranja(String description) {
        String array[] = description.split(",");
        return new Naranja(Double.valueOf(array[1]));
    }
    
}
