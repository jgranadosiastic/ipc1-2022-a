package com.jgranados.ipc1_a_2022.poo.juego.personajes;

import com.jgranados.ipc1_a_2022.poo.juego.armas.Arco;
import com.jgranados.ipc1_a_2022.poo.juego.armas.Arma;
import com.jgranados.ipc1_a_2022.poo.juego.armas.Espada;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos.Dragon;
import com.jgranados.ipc1_a_2022.poo.juego.personajes.enemigos.Troll;

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
    
    public void atacarEspada(Personaje personajeAtacado) {
        personajeAtacado.recibirAtaque(espada.calcularDaño());
    }
    
    public void atacarArco(Personaje personajeAtacado) {
        
    }
    
    public void recogerFlechas(int cantidad) {
        ((Arco) arco).agregarFlechas(cantidad);
    }
    
}
