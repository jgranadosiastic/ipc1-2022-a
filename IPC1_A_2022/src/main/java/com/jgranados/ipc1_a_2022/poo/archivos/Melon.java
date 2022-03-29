/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.archivos;

/**
 *
 * @author marito
 */
public class Melon extends Fruta {
    
    public final static int pequeño = 1;
    public final static int mediano = 2;
    public final static int grande = 3;
    /*TAMAÑO 1 2 3*/
    private int tamaño;
    
    public Melon(double precio, int tamaño) {
        super(precio);
        this.tamaño = tamaño;
    }
    
    @Override
    public String escribir() {
        return "melon,"+super.escribir()+","+tamaño;
    }
    
    public static Melon crearMelon(String description) {
        String array[] = description.split(",");
        return new Melon(Double.valueOf(array[1]), Integer.valueOf(array[2]));
    }
    
}
