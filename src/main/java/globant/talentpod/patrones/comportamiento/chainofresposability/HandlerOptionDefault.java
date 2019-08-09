/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.chainofresposability;

/**
 *
 * @author carlozandrez
 */
public class HandlerOptionDefault extends Handler{

    @Override
    public void handlerRequest(int opt) {
        System.out.println("No es una opcion valida");
    }
    
}
