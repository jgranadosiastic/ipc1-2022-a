package com.jgranados.ipc1_a_2022.poo.avanzado.listas;

/**
 *
 * @author jose
 */
public class ListaEnlazada<T> {
    
    private Nodo<T> inicio;
    private Nodo<T> ultimo;
    private int longitud = 0;
    
    
    public void agregar(T contenido) {
        if (esVacia()) {
            inicio = new Nodo<>(contenido);
            ultimo = inicio;
        } else {
            Nodo<T> nuevo = new Nodo<>(contenido);
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        longitud++;
    }
    
    public boolean esVacia() {
        return inicio == null;
    }
    
    public int obtenerLongitud() {
        return longitud;
    }
    
    public void eliminarUltimo() {
        
    }

    private Nodo<T> buscarIndice(int indice) throws Exception {
        if (indice >= longitud || indice < 0) {
            throw new Exception("Indice fuera de rango");
        }
        
        Nodo<T> actual = inicio;
        for (int i = 0; i < indice; i++) {
            Nodo<T> siguiente = actual.getSiguiente();
            actual = siguiente;
        }
        
        return actual;
    }
}
