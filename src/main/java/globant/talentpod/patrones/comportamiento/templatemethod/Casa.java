/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.templatemethod;

/**
 *
 * @author carlozandrez
 */
public abstract class Casa {
    
    public void construirCasa(){
        crearBases();
        crearParedes();
        crearTecho();
    }
    
    public abstract void crearBases();
    public abstract void crearParedes();
    public abstract void crearTecho();
    
}
