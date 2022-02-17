package com.jgranados.ipc1_a_2022;

/**
 *
 * @author jose
 */
public class Buscaminas {

    public static final int TAMAÑO = 5;
    static int bombas = 4;
    static char matriz[][] = new char[TAMAÑO][TAMAÑO];
    static int bombasEncontradas = 0;
    static boolean explotoBomba = false;
    static int casillasLevantadas = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    
    public static void distribuirBombas(char unaMatriz[][] ) {
        int posFila;
        int posColumna;
        int contador = 0;
        
        while (contador < bombas) {
            posFila = aleatorio(0, TAMAÑO - 1);
            posColumna = aleatorio(0, TAMAÑO - 1);
            
            if (unaMatriz[posFila][posColumna] != 'x') {
                unaMatriz[posFila][posColumna] = 'x';
		contador = contador + 1;
            }
        }
    }
    
    public static int aleatorio(int inicial, int max) {
        return (int)(Math.random() * ((max - inicial) + 1)) + inicial;
    }

	
}
