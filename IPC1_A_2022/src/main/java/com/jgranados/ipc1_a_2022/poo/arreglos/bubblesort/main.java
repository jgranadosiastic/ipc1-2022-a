/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.arreglos.bubblesort;

/**
 *
 * @author marito
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = {15, 20, 8, 16, 2, 100, 4};
        BubbleSort sort = new BubbleSort(arreglo);
        sort.ordenar();
        arreglo = sort.getArreglo();
        for (int i : arreglo) {
            System.out.print(i+" ");
        }
    }
    
}
