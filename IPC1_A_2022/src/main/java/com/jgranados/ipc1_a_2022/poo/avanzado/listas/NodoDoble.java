package com.jgranados.ipc1_a_2022.poo.avanzado.listas;

/**
 *
 * @author jose
 */
public class NodoDoble<T> {

    private T contenido;
    private NodoDoble<T> siguiente;
    private NodoDoble<T> anterior;

    public NodoDoble(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }

    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }
    
    
}
