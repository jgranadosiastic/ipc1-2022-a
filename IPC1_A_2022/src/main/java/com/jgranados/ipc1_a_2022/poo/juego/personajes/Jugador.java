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
        puntosDeVida = 30;
        puntosDeDefensaInferior = 3;
        puntosDeDefensaSuperior = 5;
        espada = new Espada();
        arco = new Arco();
    }
    
    public int atacarEspada(Personaje personajeAtacado) {
        return personajeAtacado.recibirAtaque(espada.calcularDaño(personajeAtacado));
    }
    
    public int atacarArco(Personaje personajeAtacado) {
        return personajeAtacado.recibirAtaque(arco.calcularDaño(personajeAtacado));
    }
    
    public void recogerFlechas(int cantidad) {
        ((Arco) arco).agregarFlechas(cantidad);
    }
    
    public int obtenerCantidadFlechas() {
        return ((Arco) arco).obtenerCantidadFlechas();
    }
    
}
