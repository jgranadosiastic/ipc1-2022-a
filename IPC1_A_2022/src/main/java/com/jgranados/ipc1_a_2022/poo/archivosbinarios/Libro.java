package com.jgranados.ipc1_a_2022.poo.archivosbinarios;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author jose
 */
public class Libro implements Serializable {
    
    private static final long serialVersionUID = 100L;

    private String isbn;
    private String autor;
    private String nombre;
    private String editorial;
    private int año;
    private LocalDate fecha;
    private boolean activo = true;

    public Libro(String isbn, String autor, String nombre, String editorial, int año, LocalDate fecha) {
        this.isbn = isbn;
        this.autor = autor;
        this.nombre = nombre;
        this.editorial = editorial;
        this.año = año;
        this.fecha = fecha;
    }
    
    @Override
    public String toString() {
        return String.format(
                "LIBRO: isbn: %s, autor: %s, nombre: %s, editorial: %s, año: %d, fecha: %s, activo: %s",
                isbn,
                autor,
                nombre,
                editorial,
                año,
                fecha,
                activo);
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getEditorial() {
        return editorial;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
    
    
        
}
