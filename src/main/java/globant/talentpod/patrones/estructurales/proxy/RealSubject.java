/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.estructurales.proxy;

/**
 *
 * @author carlozandrez
 */
public class RealSubject implements Subject{

    @Override
    public String doAction() {
        return "Accción del RealSubject";
    }
    
}
