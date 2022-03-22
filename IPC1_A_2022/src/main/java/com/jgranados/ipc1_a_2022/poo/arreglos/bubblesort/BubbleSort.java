/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.arreglos.bubblesort;

/**
 *
 * @author marito
 */
public class BubbleSort {
    
    private int arreglo[];
    
    public BubbleSort(int arreglo[]) {
        this.arreglo = arreglo;
    }
    
    public void ordenar(){
        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if(arreglo[j-1] > arreglo[j]){
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j-1];
                    arreglo[j-1]= temp;
                }
                imprimir();
            }
        }
    }
    
    private void imprimir() {
        for (int i : arreglo) {
            System.out.print(i+ " ");
        }
        System.out.println("");
    }
    
    public int[] getArreglo(){
        return arreglo;
    }
    
}
