/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.estructurales.composite;

/**
 *
 * @author carlozandrez
 */
public class Simple implements Component{
    private String nombre = "";
    
    @Override
    public String operation() {
        return this.nombre;
    }

    public Simple(String nombre) {
        this.nombre = nombre;
    }

    
    
}
