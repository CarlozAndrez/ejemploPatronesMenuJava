/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.creacionales.abstractfactory.productos;

/**
 *
 * @author carlozandrez
 */
public class BoardIntel implements Board{

    @Override
    public String operacion() {
        return "creando board compatible intel";
    }
    
}
