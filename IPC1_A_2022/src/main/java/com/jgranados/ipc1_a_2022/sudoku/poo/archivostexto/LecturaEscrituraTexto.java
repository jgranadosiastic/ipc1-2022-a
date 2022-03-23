/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.sudoku.poo.archivostexto;

import java.io.File;
import java.io.FileNotFoundException;
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

    }

}
