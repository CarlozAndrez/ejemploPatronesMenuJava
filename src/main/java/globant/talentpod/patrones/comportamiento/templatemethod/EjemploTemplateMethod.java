/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.templatemethod;

import globant.talentpod.patrones.Ejemplo;

/**
 *
 * @author carlozandrez
 */
public class EjemploTemplateMethod implements Ejemplo {

    Casa casa;

    @Override
    public void operacion() {
        casa = new CasaMadera();
        System.out.println("construir casa de madera");
        casa.construirCasa();
        casa = new CasaConcreto();
        System.out.println("construir casa de concreto");
        casa.construirCasa();
                
                

    }
}
