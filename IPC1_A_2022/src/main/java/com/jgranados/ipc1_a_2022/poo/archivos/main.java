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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fruta frutas[] = new Fruta[2];
        frutas[0] = new Limon(1.50, "común");
        frutas[1] = new Melon(12, Melon.grande);
        boolean sobreescribir = false;
        for (Fruta fruta : frutas) {
            try{    
                String filePath = "/home/marito/Documentos/prueba.txt";
                FileWriter fw = new FileWriter(filePath, sobreescribir);
                BufferedWriter bw = new BufferedWriter(fw);
                String lineaRemplazo = fruta.escribir();
                if(sobreescribir){
                    lineaRemplazo = "\n" + lineaRemplazo;
                }
                bw.write(lineaRemplazo);
                bw.close();
            } catch(Exception e){
                System.out.println(e);
            }
            if(!sobreescribir) {
                sobreescribir = true;
            }
        }
    }
    
}
