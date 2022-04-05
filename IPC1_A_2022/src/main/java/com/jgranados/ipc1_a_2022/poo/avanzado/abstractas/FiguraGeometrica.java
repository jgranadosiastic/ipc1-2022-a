package com.jgranados.ipc1_a_2022.poo.avanzado.abstractas;

/**
 *
 * @author jose
 */
public abstract class FiguraGeometrica {
    
    /**
     * La firma de un metodo consiste en su modificador de visibilidad,
     * las alteracion en base a static, final, abstract, y en su tipo.
     * Tambien se incluye el nombre y los parametros (cantidad como tipo)
     * @return 
     */
    public abstract float calcularArea();
    
    public abstract float calcularPerimetro();
}
