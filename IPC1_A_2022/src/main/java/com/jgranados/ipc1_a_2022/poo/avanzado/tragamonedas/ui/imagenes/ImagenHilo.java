package com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes;

import java.awt.Dimension;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jose
 */
public class ImagenHilo extends JLabel implements Runnable {

    public static final int IMAGE_WIDTH = 150;
    public static final int IMAGE_HEIGHT = 150;
    public static final String IMAGES_ROOT_PATH = "/com/jgranados/ipc1_a_2022/poo/avanzado/tragamonedas/ui/imagenes/";
    public static final String[] IMAGES = new String[]{
        "bell.png",
        "cherry.png",
        "dollar-symbol.png",
        "grapes.png"
    };
    
    protected boolean detenido = false;

    public ImagenHilo() {
        this.setSize(IMAGE_WIDTH, IMAGE_HEIGHT);
        this.setMaximumSize(new Dimension(IMAGE_WIDTH, IMAGE_HEIGHT));
    }

    protected void establecerImagen(String imagenPath) {
        this.setIcon(new ImageIcon(getClass().getResource(IMAGES_ROOT_PATH + imagenPath)));
    }

    @Override
    public void run() {
        Random random = new Random();
        int sleep = (random.nextInt(500) + 500) * 2;
        int vueltas = random.nextInt(10) + 5;
        Icon currentIcon = getIcon();
        for (int i = 0; i < vueltas; i++) {
            int imageIndex = i % 4;
            System.out.println("imagen: " + getClass().getName() + " vueltas: " + vueltas);
            establecerImagen(IMAGES[imageIndex]);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException ex) {
                System.out.println("Error con el spleep");
            }
        }
        setIcon(currentIcon);
        detenido = true;
    }
    
    public boolean estaDetenido() {
        return detenido;
    }
}
