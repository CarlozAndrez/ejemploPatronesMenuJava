/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.estructurales.decorator;

/**
 *
 * @author carlozandrez
 */
public class WrapperUno extends OptionalWrapper{

    public WrapperUno(Component componente) {
        super(componente);
    }
    
    
    @Override
    public String doThis() {
        return componente.doThis() + " + operacion WrapperUno ";
    }
   
    
}
