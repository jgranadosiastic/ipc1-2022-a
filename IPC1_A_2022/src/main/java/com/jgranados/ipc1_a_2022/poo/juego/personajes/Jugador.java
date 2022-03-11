package com.jgranados.ipc1_a_2022.poo.juego.personajes;

import com.jgranados.ipc1_a_2022.poo.juego.armas.Arco;
import com.jgranados.ipc1_a_2022.poo.juego.armas.Arma;
import com.jgranados.ipc1_a_2022.poo.juego.armas.Espada;

/**
 *
 * @author jose
 */
public class Jugador extends Personaje {
    private Arma espada;
    private Arma arco;

    public Jugador() {
        espada = new Espada();
        arco = new Arco();
    }
    
    public void atacarEspada() {
        
    }
    
    public void atacarArco() {
        
    }
    
    public void recogerFlechas(int cantidad) {
        ((Arco) arco).agregarFlechas(cantidad);
    }
    
}
