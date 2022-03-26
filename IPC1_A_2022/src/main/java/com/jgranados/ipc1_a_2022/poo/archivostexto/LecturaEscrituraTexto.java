/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.poo.archivostexto;

import com.jgranados.ipc1_a_2022.poo.arreglos.Libro;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class LecturaEscrituraTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //File file = new File("/media/jose/DATA/CUNOC/IPC1/01 2022/Clases/2022-03-23.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un path a leer");
        String path = scanner.nextLine();
        File file = new File(path);
        System.out.println("Existe: " + file.exists());
        System.out.println("Se puede leer: " + file.canWrite());
        System.out.println("el path: " + file.getPath());
        System.out.println("el absolute path: " + file.getAbsolutePath());
        System.out.println("el nombre: " + file.getName());
        System.out.println("Es carpeta: " + file.isDirectory());

        try {
            Scanner scannerArchivo = new Scanner(file);
            while (scannerArchivo.hasNextLine()) {
                String linea = scannerArchivo.nextLine();
                System.out.println(String.format("LINEA: %s, LONGITUD: %d", linea, linea.length()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo que ingreso no existe.");
        }

        Libro[] libros = new Libro[5];
        
        libros[0] = new Libro("a", "Jose Granados", "POO", "Propio");
        libros[1] = new Libro("f", "Pedro Ramirez", "Pre calculo", "Editorial Mate");
        libros[2] = new Libro("z", "Maria Fernandez", "Fisica fundamental", "Editorial Fisica");
        libros[3] = new Libro("x", "Mario Cifuentes", "Compiladores", "Editorial compi");
        libros[4] = new Libro("i", "Rosa Cajas", "Quimica 1", "Editorial Quimica");
        
        System.out.println("Ingrese un path a escribir");
        path = scanner.nextLine();
        File fileDestino = new File(path);
        
        try {
            PrintWriter printer = new PrintWriter(fileDestino);
            for (Libro libro : libros) {
                printer.println("LIBRO:");
                printer.println(
                        String.format(
                                "Nombre: %s, Autor: %s",
                                libro.obtenerNombre(),
                                libro.obtenerAutor()
                        )
                );
            }
            printer.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo que ingreso no existe.");
        }
        
        File fileDestinoHTML = new File("archivo.html");
        try {
            PrintWriter printer = new PrintWriter(fileDestinoHTML);
            printer.println("<html>");
            for (Libro libro : libros) {
                printer.println("LIBRO:");
                printer.println(
                        String.format(
                                "<h1>%s</h1> <p>%s</p>",
                                libro.obtenerNombre(),
                                libro.obtenerAutor()
                        )
                );
            }
            printer.println("</html>");
            printer.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo que ingreso no existe.");
        }
        
        
    }

}
