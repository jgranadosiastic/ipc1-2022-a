package com.jgranados.ipc1_a_2022.poo.avanzado.listas;

/**
 *
 * @author jose
 */
public class Nodo<T> {
    private T contenido;
    private Nodo<T> siguiente;

    public Nodo(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }
    
    public void setContenido(T nuevoContenido) {
        contenido = nuevoContenido;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    
}
