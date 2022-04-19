package com.jgranados.ipc1_a_2022.poo.avanzado.pilacola;



/**
 *
 * @author jose
 */
public class Pila<T> {

    private T[] contenedor;
    private int indiceTope = -1;

    public Pila(int size) {
        this.contenedor = (T[]) new Object[size];
    }

    public boolean esVacia() {
        return indiceTope < 0;
    }

    public boolean estaLlena() {
        return indiceTope == contenedor.length - 1;
    }

    /**
     * Apila un nuevo elemento dentro de la pila
     * @param libro el libro a apilar
     * @throws PilaException    cuando la pila esta llena
     */
    public void apilar(T libro) throws PilaException {
        if (estaLlena()) {
            throw new PilaException("La pila está llena!");
        }

        contenedor[indiceTope + 1] = libro;
        indiceTope++;
    }

    /**
     * Desapila un elemento y lo devuelve
     *
     * @return el elemento desapilado
     * @throws PilaException cuando esta vacia
     */
    public T desapilar() throws PilaException {
        if (esVacia()) {
            throw new PilaException("La pila está vacia!");
        }
        T aDesapilar = contenedor[indiceTope];
        indiceTope--;

        return aDesapilar;
    }

    public T verTope(T libro) throws PilaException {
        if (esVacia()) {
            throw new PilaException("La pila está vacia!");
        }

        return contenedor[indiceTope];
    }
}
