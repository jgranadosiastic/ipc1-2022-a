/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marito
 */
public class lectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            File doc = new File("/home/marito/Documentos/prueba.txt");
            Scanner obj = new Scanner(doc);
            int i = 0;
            while (obj.hasNextLine()){
                Fruta fruta = Fruta.crearFruta(obj.nextLine());
                System.out.println(fruta.escribir());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lectura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
