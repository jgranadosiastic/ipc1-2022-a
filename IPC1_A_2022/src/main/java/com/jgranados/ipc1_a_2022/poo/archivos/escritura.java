/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author marito
 */
public class escritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{    
            String filePath = "/home/marito/Documentos/prueba.txt";
            FileWriter fw = new FileWriter(filePath, true); 
            BufferedWriter bw = new BufferedWriter(fw);
            String lineaRemplazo = "\nnaranja";    
            bw.write(lineaRemplazo);
            bw.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
}
