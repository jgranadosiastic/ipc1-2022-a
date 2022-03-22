package com.jgranados.ipc1_a_2022.sudoku;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marito
 */
public class sudokuMain {

    /**
     * @param args the command line arguments
     */
    public static int TAMAÑO_SUDOKU = 9;
    
    public static void main(String[] args) {
        // TODO code application logic here
        int tablero[][] = {
            {0, 0, 8, 0, 5, 4, 0, 0, 0},
            {9, 0, 0, 0, 0, 0, 5, 0, 0},
            {0, 4, 0, 0, 0, 1, 0, 0, 6},
            {0, 0, 7, 0, 0, 3, 0, 0, 0},
            {8, 9, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 4, 0, 0, 9, 0, 0, 0},
            {0, 0, 0, 1, 0, 2, 0, 8, 0},
            {0, 8, 9, 0, 0, 5, 0, 0, 0},
            {0, 2, 3, 0, 9, 0, 0, 0, 0}
        };
        if(validarTablero(tablero)) {
            System.out.println("Es un tablero Valido y esta Resuelto!");
        } else {
            System.out.println("Es un tablero que no se puede resolver!");
        }
        imprimirTablero(tablero);
    }
    
    public static void imprimirTablero(int[][] tablero) {
        for (int fila = 0; fila < TAMAÑO_SUDOKU; fila++) {
            if(fila % 3 == 0) {
                System.out.println("-------------");
            }
            for (int columna = 0; columna < TAMAÑO_SUDOKU; columna++) {
                if(columna % 3 == 0) {
                    System.out.print("|");
                }
                System.out.print(tablero[fila][columna]);
            }
            System.out.print("|");
            System.out.println("");
        }
        System.out.println("-------------");
    }
    
    public static boolean estaNumeroEnFila(int[][] tablero, int numero, int fila) {
        for (int i = 0; i < TAMAÑO_SUDOKU; i++) {
            if(tablero[fila][i]==numero){
                return true;
            }
        }
        return false;
    }
        
    public static boolean estaNumeroEnColumna(int[][] tablero, int numero, int columna) {
        for (int i = 0; i < TAMAÑO_SUDOKU; i++) {
            if(tablero[i][columna]==numero){
                return true;
            }
        }
        return false;
    }
    
    public static boolean estaNumeroEn3x3(int[][] tablero, int numero, int fila,  int columna) {
        int posFila3x3 = fila - fila % 3;
        int posColumna3x3 = columna - columna % 3;
        for (int i = posFila3x3; i < posFila3x3+3; i++) {
            for (int j = posColumna3x3; j < posColumna3x3+3; j++) {
                if(tablero[i][j] == numero) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean esPosicionValida(int[][] tablero, int numero, int fila,  int columna) {
        return !estaNumeroEnFila(tablero, numero, fila) &&
                !estaNumeroEnColumna(tablero, numero, columna) &&
                !estaNumeroEn3x3(tablero, numero, fila, columna);
    }
    
    public static boolean validarTablero(int[][] tablero) {
        for (int fila = 0; fila < TAMAÑO_SUDOKU; fila++) {
            for (int columna = 0; columna < TAMAÑO_SUDOKU; columna++) {
                if(tablero[fila][columna] == 0) {
                    for (int numero = 1; numero <= TAMAÑO_SUDOKU; numero++) {
                        if(esPosicionValida(tablero, numero, fila, columna)) {
                            tablero[fila][columna] = numero;
                            if(validarTablero(tablero)) {
                                return true;
                            } else {
                                tablero[fila][columna] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
}
