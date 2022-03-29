/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.ipc1_a_2022.swing;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author jose
 */
public class MiPropioFrame extends JFrame {
    private JButton button;
    private JTextField texto;
    private JLabel etiqueta;

    public MiPropioFrame() {
        this.setTitle("Hola Mundo");
        button = new JButton("Click");
        button.setBounds(130, 100, 100, 40);
        
        texto = new JTextField("Hola mundo");
        texto.setBounds(130, 10, 200, 40);
        
        etiqueta = new JLabel();
        etiqueta.setBounds(130, 200, 200, 40);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                unMetodo();
            }
        });
        
        this.setSize(400, 500);
        this.add(button);
        this.add(texto);
        this.add(etiqueta);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setVisible(true);
    }
    

        
    
    private void unMetodo() {
        etiqueta.setText(texto.getText());
    }
}
