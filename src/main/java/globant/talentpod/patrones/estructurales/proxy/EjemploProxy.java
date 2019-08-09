/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.estructurales.proxy;

import globant.talentpod.patrones.Ejemplo;

/**
 *
 * @author carlozandrez
 */
public class EjemploProxy implements Ejemplo{

    @Override
    public void operacion() {
        Proxy p = new Proxy();
        for(int i=0; i<10; i++)
            System.out.println(p.doAction());
    }
    
}
