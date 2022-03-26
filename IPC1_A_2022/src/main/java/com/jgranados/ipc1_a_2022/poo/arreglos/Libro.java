package com.jgranados.ipc1_a_2022.poo.arreglos;

/**
 *
 * @author jose
 */
public class Libro {

    private String isbn;
    private String autor;
    private String nombre;
    private String editorial;

    public Libro(String isbn, String autor, String nombre, String editorial) {
        this.isbn = isbn;
        this.autor = autor;
        this.nombre = nombre;
        this.editorial = editorial;
    }
    
    @Override
    public String toString() {
        return String.format(
                "LIBRO: isbn: %s, autor: %s, nombre: %s, editorial: %s",
                isbn,
                autor,
                nombre,
                editorial);
    }
    
    public void imprimirDatos() {
        System.out.println(toString());
    }
    
    //getter
    public String obtenerISBN() {
        return isbn;
    }
    
    public boolean tieneISBN(String isbnAComparar) {
        return isbn.equals(isbnAComparar);
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerAutor() {
        return autor;
    }
        
}
