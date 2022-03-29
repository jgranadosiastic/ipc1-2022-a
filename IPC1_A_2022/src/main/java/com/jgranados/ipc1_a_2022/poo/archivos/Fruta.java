/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.archivos;

/**
 *
 * @author marito
 */
public abstract class Fruta {
    
    protected double precio;
    
    public Fruta(double precio) {
        this.precio = precio;
    }
    
    public String escribir() {
        return this.precio + "";
    }
    
    public static Fruta crearFruta(String description) {
        String array[] = description.split(",");
        switch (array[0]) {
            case "limon":
                return Limon.crearLimon(description);
            case "naranja":
                return Naranja.crearNaranja(description);
            case "melon":
                return Melon.crearMelon(description);
            default:
                return null;
        }
    }
    
}
