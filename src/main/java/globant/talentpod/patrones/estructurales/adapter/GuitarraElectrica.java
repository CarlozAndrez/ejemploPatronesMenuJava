/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.estructurales.adapter;

/**
 *
 * @author carlozandrez
 */
public class GuitarraElectrica extends Guitarra {

    @Override
    public void onGuitar() {
        System.out.println("tocando guitarra");
    }

    @Override
    public void offGuitar() {
        System.out.println("cansado de tocar guitarra");
    }
}
