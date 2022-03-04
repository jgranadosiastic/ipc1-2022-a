/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.poo.abstraccion;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class MainArticulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un costo base:");
        double costo = scanner.nextDouble();
        
        Articulo articuloNuevo = new Articulo();
        articuloNuevo.costoBase = costo;
        
        System.out.println("Precio al Detalle: " + articuloNuevo.calcularPrecioDetalle());
        System.out.println("Precio al Mayor: " + articuloNuevo.calcularPrecioAlMayor());
        
        Articulo otroArticulo = new Articulo();
    }
    
}
