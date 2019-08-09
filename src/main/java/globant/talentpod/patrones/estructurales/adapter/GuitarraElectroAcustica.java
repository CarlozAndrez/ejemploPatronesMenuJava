/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.estructurales.adapter;

/**
 *
 * @author carlozandrez
 */
public class GuitarraElectroAcustica extends Guitarra{
    GuitarraAcustica guitarra = new GuitarraAcustica();

    @Override
    public void onGuitar() {
        guitarra.tocar();
    }

    @Override
    public void offGuitar() {
        guitarra.dejar();
    }
    
}
