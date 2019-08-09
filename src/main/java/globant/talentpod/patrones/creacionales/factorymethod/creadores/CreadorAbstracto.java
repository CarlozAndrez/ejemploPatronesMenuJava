/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.creacionales.factorymethod.creadores;

import globant.talentpod.patrones.creacionales.factorymethod.productos.Producto;

/**
 *
 * @author carlozandrez
 */
public abstract class CreadorAbstracto {
    public Producto crearProducto(){
        return factoryMethod();
    }
    
    public abstract Producto factoryMethod();
    
}
