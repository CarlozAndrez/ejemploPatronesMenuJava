/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.estructurales.bridge;

/**
 *
 * @author carlozandrez
 */
public class ImplementorOne implements Implementor{

    @Override
    public void operation(String valor) {
        System.out.println("Operacion del implementador uno " + valor);
    }
    
}
