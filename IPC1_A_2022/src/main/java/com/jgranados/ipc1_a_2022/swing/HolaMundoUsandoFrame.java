/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author jose
 */
public class HolaMundoUsandoFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*JFrame primerFrame = new JFrame("Hola Mundo");
        JButton button = new JButton("Click");
        button.setBounds(130, 100, 100, 40);
        primerFrame.setSize(400, 500);
        
        primerFrame.add(button);
        primerFrame.setLayout(null);
        primerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        primerFrame.setVisible(true);*/
        
        
        MiPropioFrame frame1 = new MiPropioFrame();
        
        FrameDesdeNetbeans frame = new FrameDesdeNetbeans();
        frame.setVisible(true);
        
        
        
    }
    
}
