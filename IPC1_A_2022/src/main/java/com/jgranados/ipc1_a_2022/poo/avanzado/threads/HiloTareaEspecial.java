package com.jgranados.ipc1_a_2022.poo.avanzado.threads;

/**
 *
 * @author jose
 */
public class HiloTareaEspecial extends TareaPadre implements Runnable {

    private int sleepTime;
    private String nombre;

    public HiloTareaEspecial(int sleepTime, String nombre) {
        this.sleepTime = sleepTime;
        this.nombre = nombre;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(nombre + ": contando " + i);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException ex) {
                System.out.println("algo paso, deberia implementar una logica que maneje este error");
            }
        }
    }
}
