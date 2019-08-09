/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.creacionales.abstractfactory.productos;

/**
 *
 * @author carlozandrez
 */
public class MemoriaAmd implements Memoria{
    
    @Override
    public String operacion() {
        return "creando memoria compatible AMD";
    }
}
