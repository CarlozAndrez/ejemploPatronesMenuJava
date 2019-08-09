/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.creacionales.factorymethod.productos;

/**
 *
 * @author carlozandrez
 */
public class ProductoConcreto implements Producto{

    @Override
    public String operacion() {
        return "Operación del producto concreto";
    }
    
}
