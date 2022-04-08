/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jose
 */
public abstract class Imagen extends JLabel {

    public static final int IMAGE_WIDTH = 150;
    public static final int IMAGE_HEIGHT = 150;
    public static final String IMAGES_ROOT_PATH = "/com/jgranados/ipc1_a_2022/poo/avanzado/tragamonedas/ui/imagenes/";

    public Imagen() {
        this.setSize(IMAGE_WIDTH, IMAGE_HEIGHT);
        this.setMaximumSize(new Dimension(IMAGE_WIDTH, IMAGE_HEIGHT));
    }

    protected void establecerImagen(String imagenPath) {
        this.setIcon(new ImageIcon(getClass().getResource(IMAGES_ROOT_PATH + imagenPath)));
    }
}
