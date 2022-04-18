package com.jgranados.ipc1_a_2022.poo.avanzado.pilacola;

import com.jgranados.ipc1_a_2022.poo.arreglos.Libro;

/**
 *
 * @author jose
 */
public class PilaLibros {

    private Libro[] contenedorLibros;
    private int indiceTope = -1;

    public PilaLibros(int size) {
        this.contenedorLibros = new Libro[size];
    }
    
    public boolean esVacia() {
        return indiceTope < 0;
    }
    
    public boolean estaLlena() {
        return indiceTope == contenedorLibros.length - 1;
    }
    
    public void apilar(Libro libro) throws PilaException {
        if (estaLlena()) {
            throw new PilaException("La pila está llena!");
        }
        
        contenedorLibros[indiceTope + 1] = libro;
        indiceTope++;
    }
    
    public Libro desapilar() throws PilaException {
        if (esVacia()) {
            throw new PilaException("La pila está vacia!");
        }
        Libro aDesapilar = contenedorLibros[indiceTope];
        indiceTope--;
        
        return aDesapilar;
    }
    
    public Libro verTope(Libro libro) throws PilaException {
        if (esVacia()) {
            throw new PilaException("La pila está vacia!");
        }
        
        return contenedorLibros[indiceTope];
    }
}
