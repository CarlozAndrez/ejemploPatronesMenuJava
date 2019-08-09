/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.creacionales.factorymethod;

import globant.talentpod.patrones.Ejemplo;
import globant.talentpod.patrones.creacionales.factorymethod.creadores.CreadorAbstracto;
import globant.talentpod.patrones.creacionales.factorymethod.creadores.CreadorConcreto;
import globant.talentpod.patrones.creacionales.factorymethod.productos.Producto;

/**
 *
 * @author carlozandrez
 */
public class EjemploFactoryMethod implements Ejemplo{
    CreadorAbstracto creador;
    Producto producto;
    @Override
    public void operacion() {
        creador = new CreadorConcreto();
        producto = creador.crearProducto();
        System.out.println(producto.operacion());
    }
    
}
