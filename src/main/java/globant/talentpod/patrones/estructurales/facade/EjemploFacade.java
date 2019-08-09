/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.estructurales.facade;

import globant.talentpod.patrones.Ejemplo;

/**
 *
 * @author carlozandrez
 */
public class EjemploFacade implements Ejemplo{

    @Override
    public void operacion() {
        FachadaLibreria libreria = new FachadaLibreria();
        System.out.println(libreria.buscarLibros());
        System.out.println(libreria.buscarMusica());
        System.out.println(libreria.buscarVideos());
    }
    
}
