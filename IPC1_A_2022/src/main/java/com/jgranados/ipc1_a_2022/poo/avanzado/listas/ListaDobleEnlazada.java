package com.jgranados.ipc1_a_2022.poo.avanzado.listas;

/**
 *
 * @author jose
 */
public class ListaDobleEnlazada<T> {

    private NodoDoble<T> inicio;
    private NodoDoble<T> ultimo;
    
    private int longitud = 0;

    public void agregar(T contenido) {
        if (esVacia()) {
            NodoDoble<T> nuevo = new NodoDoble<>(contenido);
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            NodoDoble<T> nuevo = new NodoDoble<>(contenido);
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
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

    public void eliminarElementoEnIndice(int indice) throws ListaException {
        if (indice >= longitud || indice < 0) {
            throw new ListaException("Indice fuera de rango");
        }
        
        if (indice == 0) {
            inicio = inicio.getSiguiente();
            if (inicio != null) {
                inicio.setAnterior(null);
            }
        } else if (indice == longitud - 1) {
            eliminarUltimo();
        } else {
            NodoDoble<T> actual = buscarIndice(indice);
            NodoDoble<T> anterior = actual.getAnterior();
            NodoDoble<T> siguiente = actual.getSiguiente();
            
            siguiente.setAnterior(anterior);
            anterior.setSiguiente(siguiente);
        }
        longitud--;

    }

    public void eliminarUltimo() throws ListaException {
        if (esVacia()) {
            throw new ListaException("La lista esta vacia!");
        } else if (longitud == 1) {
            inicio = null;
            ultimo = null;
        } else {
            NodoDoble<T> anterior = ultimo.getAnterior();
            anterior.setSiguiente(null);
            ultimo = anterior;
        }
        longitud--;
    }

    public T obtenerContenido(int indice) throws ListaException {
        return buscarIndice(indice).getContenido();
    }

    public NodoDoble<T> buscarIndice(int indice) throws ListaException {
        if (indice >= longitud || indice < 0) {
            throw new ListaException("Indice fuera de rango");
        }
        
        int mitad = longitud / 2;
        if (indice <= mitad) {
            return buscarDeInicioAUltimo(indice);
        } else {
            return buscarDeUltimoAInicio(indice);
        }
    }
    
    public NodoDoble<T> buscarDeInicioAUltimo(int indice) throws ListaException {
        if (indice >= longitud || indice < 0) {
            throw new ListaException("Indice fuera de rango");
        }
        
        NodoDoble<T> actual = inicio;
        for (int i = 0; i < indice; i++) {
            NodoDoble<T> siguiente = actual.getSiguiente();
            actual = siguiente;
        }

        return actual;
    }
    
    public NodoDoble<T> buscarDeUltimoAInicio(int indice) throws ListaException {
        if (indice >= longitud || indice < 0) {
            throw new ListaException("Indice fuera de rango");
        }
        
        NodoDoble<T> actual = ultimo;
        for (int i = 0; i < indice; i++) {
            NodoDoble<T> anterior = actual.getAnterior();
            actual = anterior;
        }

        return actual;
    } 
    
}
