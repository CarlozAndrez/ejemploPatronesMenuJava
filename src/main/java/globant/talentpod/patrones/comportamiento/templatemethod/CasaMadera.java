/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.templatemethod;

/**
 *
 * @author carlozandrez
 */
public class CasaMadera extends Casa{

    @Override
    public void crearBases() {
        System.out.println("colocando bases de madera");
    }

    @Override
    public void crearParedes() {
        System.out.println("colocando paredes de madera");
    }

    @Override
    public void crearTecho() {
        System.out.println("colocando techo de madera");
    }
    
}
