/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.poo.archivosbinarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.time.LocalDate;

/**
 *
 * @author jose
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro unLibro = new Libro("aa", "Pedro Ramirez", "POO", "Super", 2010, LocalDate.now());
        
        File miArchivo = new File("/home/jose/libro.lb");
        // Almacenamiento de detos en archivos de texto (tiene muchos inconvenientes)
       /* 
        try (PrintWriter printer = new PrintWriter(miArchivo);) {
            printer.println(unLibro.obtenerISBN());
            printer.println(unLibro.obtenerAutor());
            printer.println(unLibro.obtenerNombre());
            printer.println(unLibro.getEditorial());
            printer.println(unLibro.getAño());
            printer.println(unLibro.getFecha());
        } catch (FileNotFoundException e) {
            System.out.println("El archivo que ingreso no existe.");
        }
        */
        
        ///
        ///
        ///
        ///
        ///
        ///
        
        
        /*
        Libro libroRecuperado = null;
        try (Scanner scannerArchivo = new Scanner(miArchivo);) {
            String isbn = scannerArchivo.nextLine();
            String autor = scannerArchivo.nextLine();
            String nombre = scannerArchivo.nextLine();
            String editorial = scannerArchivo.nextLine();
            int año = scannerArchivo.nextInt();
            libroRecuperado = new Libro(isbn, autor, nombre, editorial, año);
            libroRecuperado.imprimirDatos();
            
        } catch (FileNotFoundException e) {
            System.out.println("El archivo que ingreso no existe.");
        }*/
        
        // Almacenamiento de datos en archivos binarios de bajo nivel.
        // Mala idea usar los de bajo nivel si no tenemos el conocimiento de 
        // manejo de bytes y transformacion de data a bytes.
        /*
        try (FileOutputStream outputStream = new FileOutputStream(miArchivo);) {
            outputStream.write(unLibro.obtenerISBN().getBytes());
            outputStream.write(unLibro.obtenerAutor().getBytes());
            outputStream.write(unLibro.obtenerNombre().getBytes());
            outputStream.write(unLibro.getEditorial().getBytes());
            outputStream.write(unLibro.getAño());
            outputStream.write(longToBytes(unLibro.getFecha().toEpochDay()));
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        Libro libroRecuperado = null;
        try (FileInputStream inputStream = new FileInputStream(miArchivo);) {
            String isbn = new String(inputStream.read());
            
            //libroRecuperado = new Libro(isbn, autor, nombre, editorial, año);
            //libroRecuperado.imprimirDatos();
        } catch (Exception e) {
            System.out.println("Error");
        }
        */
        
        // DataOutputStream mi sivre para almacenar datos primitivos de forma facil
        // y recuperarlos y transformarlos de forma facil.
        /*
        try (DataOutputStream outputStream = new DataOutputStream(out)) {
            
        }*/
        
        // Almacenamiento de datos complejos utilizand el ObjectOutputStream, pero
        // separando cada dato antes de guardar.
        /*
        try (
                FileOutputStream outputStream = new FileOutputStream(miArchivo);
                ObjectOutputStream objectStream = new ObjectOutputStream(outputStream);) {
            objectStream.writeUTF(unLibro.obtenerISBN());
            objectStream.writeUTF(unLibro.obtenerAutor());
            objectStream.writeUTF(unLibro.obtenerNombre());
            objectStream.writeUTF(unLibro.getEditorial());
            objectStream.writeInt(unLibro.getAño());
            objectStream.writeObject(unLibro.getFecha());
            
        } catch(Exception e) {
            System.out.println("Error.");
        }
        
        try (
                FileInputStream inputStream = new FileInputStream(miArchivo);
                ObjectInputStream objectStream = new ObjectInputStream(inputStream);) {
            Libro recuperado = new Libro(
                    objectStream.readUTF(),
                    objectStream.readUTF(),
                    objectStream.readUTF(),
                    objectStream.readUTF(),
                    objectStream.readInt(),
                    (LocalDate) objectStream.readObject()
            );
            
            recuperado.imprimirDatos();
        } catch(Exception e) {
            System.out.println("Error.");
        }*/
        
        /*try (
                FileOutputStream outputStream = new FileOutputStream(miArchivo);
                ObjectOutputStream objectStream = new ObjectOutputStream(outputStream);) {
            
            objectStream.writeObject(unLibro);
            
        } catch(Exception e) {
            System.out.println("Error.");
            e.printStackTrace();
        }*/
        
        try (
                FileInputStream inputStream = new FileInputStream(miArchivo);
                ObjectInputStream objectStream = new ObjectInputStream(inputStream);) {
            Libro recuperado = (Libro) objectStream.readObject();
            
            recuperado.imprimirDatos();
        } catch(Exception e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }
    
    private static byte[] longToBytes(long data) {
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.putLong(data);
        return buffer.array();
    }
    
}
