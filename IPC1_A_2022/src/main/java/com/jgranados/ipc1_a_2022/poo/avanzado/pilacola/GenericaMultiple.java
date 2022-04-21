package com.jgranados.ipc1_a_2022.poo.avanzado.pilacola;

/**
 *
 * @author jose
 */
public class GenericaMultiple<T, K, V> {
    
    private T elementoGenerico1;
    private K elementoGenerico2;
    private V elementoGenerico3;
    
    public K getGenerico2() {
        return elementoGenerico2;
    }
    
    public T getGenerico1() {
        return elementoGenerico1;
    }
    
    public V getGenerico3() {
        return elementoGenerico3;
    }
    
    public V operarAlgo(V elemento) {
        // mucha logica
        return elemento;
    }
    
    public K operarAlgoK() {
        // mucha logica
        return elementoGenerico2;
    }
    
}
