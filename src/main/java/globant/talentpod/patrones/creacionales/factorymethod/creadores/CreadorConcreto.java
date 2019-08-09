/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.creacionales.factorymethod.creadores;

import globant.talentpod.patrones.creacionales.factorymethod.productos.Producto;
import globant.talentpod.patrones.creacionales.factorymethod.productos.ProductoConcreto;

/**
 *
 * @author carlozandrez
 */
public class CreadorConcreto extends CreadorAbstracto{

    @Override
    public Producto factoryMethod() {
        return new ProductoConcreto();
    }
    
}
