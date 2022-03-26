package com.jgranados.ipc1_a_2022.poo.arreglos;

/**
 *
 * @author jose
 */
public class ArregloOrdenadoPorInsercion {
    
    private Libro[] libros;
    private int ultimoIndice;
    
    public ArregloOrdenadoPorInsercion(int size) {
        libros = new Libro[size];
        ultimoIndice = -1;
    }
    
    public void agregarLibro(String isbn, String autor, String nombre, String editorial) {
        Libro libroAInsertar = new Libro(isbn, autor, nombre, editorial);
        if (esVacio()) {
            int siguienteCasilla = obtenerSiguienteCasilla();
            libros[siguienteCasilla] = libroAInsertar;
        } else {
            Libro ultimoLibroInsertado = libros[ultimoIndice];
            if (isbn.compareToIgnoreCase(ultimoLibroInsertado.obtenerISBN()) >= 0) {
                int siguienteCasilla = obtenerSiguienteCasilla();
                libros[siguienteCasilla] = libroAInsertar;
            } else {
                int indice = ultimoIndice;
                while (indice >= 0) {
                    if (libros[indice].obtenerISBN().compareToIgnoreCase(isbn) > 0) {
                        Libro libro = libros[indice];
                        libros[indice + 1] = libro;
                        indice--;
                    } else {
                        break;
                    }
                }
                libros[indice + 1] = libroAInsertar;
            }
        }
        ultimoIndice++;
    }
    
    private boolean esVacio() {
        return ultimoIndice == -1;
    }
    
    private int obtenerSiguienteCasilla() {
        return ultimoIndice + 1;
    }
    
    public void imprimirArreglo() {
        for (Libro libro : libros) {
            if (libro != null) {
                libro.imprimirDatos();
            }
        }
    }

}
