/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.estructurales.decorator;

import globant.talentpod.patrones.Ejemplo;

/**
 *
 * @author carlozandrez
 */
public class EjemploDecorator implements Ejemplo{

    @Override
    public void operacion() {
        Component real = new RealComponent();
        System.out.println(real.doThis());
        Component wrapper = new WrapperUno(real);
        System.out.println(wrapper.doThis());
        Component wrapper2 = new WrapperUno(wrapper);
        System.out.println(wrapper2.doThis());
       
    }
    
}
