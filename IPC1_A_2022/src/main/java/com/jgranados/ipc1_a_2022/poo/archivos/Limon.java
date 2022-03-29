/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.archivos;

/**
 *
 * @author marito
 */
public class Limon extends Fruta {
    
    private String tipo;
    
    public Limon(double precio, String tipo) {
        super(precio);
        this.tipo = tipo;
    }
    
    @Override
    public String escribir() {
        return "limon,"+super.escribir()+","+tipo;
    }
    
    public static Limon crearLimon(String description) {
        String array[] = description.split(",");
        return new Limon(Double.valueOf(array[1]), array[2]);
    }
    
}
