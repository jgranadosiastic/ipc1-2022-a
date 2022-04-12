package com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.backend;

import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.backend.exception.TragamonedasException;
import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.TragamonedasFrame;
import com.jgranados.ipc1_a_2022.poo.avanzado.tragamonedas.ui.imagenes.ImagenHilo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class ControladorImagenesHilo extends Thread {
    
    private ImagenHilo[] imagenes;
    private TragamonedasFrame frame;

    public ControladorImagenesHilo(ImagenHilo[] imagenes, TragamonedasFrame frame) {
        this.imagenes = imagenes;
        this.frame = frame;
    }
    
    @Override
    public void run() {
        boolean todosCompletos = false;
        frame.desactivarControlesApuesta();
        frame.desplegarImagenesHilos();
        while(!todosCompletos) {
            boolean acumulador = true;
            for (ImagenHilo imagen : imagenes) {
                acumulador = acumulador && imagen.estaDetenido();
            }
            try {
                System.out.println("acumulador: " + acumulador);
                sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("error al dormir");
            }
            todosCompletos = acumulador;
        }
        
        
        try {
            frame.procesarGananciaExcepciones();
            frame.actualizarSaldo();
            frame.activarControlesApuesta();
        } catch (TragamonedasException e) {
            JOptionPane.showMessageDialog(
                    frame,
                    e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

}
