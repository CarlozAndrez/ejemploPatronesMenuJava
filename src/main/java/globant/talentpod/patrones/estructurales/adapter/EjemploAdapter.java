/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.estructurales.adapter;

import globant.talentpod.patrones.Ejemplo;

/**
 *
 * @author carlozandrez
 */
public class EjemploAdapter implements Ejemplo{

    @Override
    public void operacion() {
        System.out.println("Guitarra Electrica");
        Guitarra eGuitarra = new GuitarraElectrica();
        eGuitarra.onGuitar();
        eGuitarra.offGuitar();
        
        System.out.println("Guitarra ElectroAcustica");
        Guitarra eaGuitarra = new GuitarraElectroAcustica();
        eaGuitarra.onGuitar();
        eaGuitarra.offGuitar();
    }
    
}
