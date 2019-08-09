/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.creacionales.builder;

import java.util.Iterator;
import globant.talentpod.patrones.Ejemplo;

/**
 *
 * @author carlozandrez
 */
public class EjemploBuilder implements Ejemplo{

    @Override
    public void operacion() {
        Agencia agencia = new Agencia();
        agencia.setConstructor(new BuguieTour());
        agencia.construirTour();
        
        Tour tour = agencia.getTour();
        Iterator itHoteles = tour.getHoteles().listIterator();
        Iterator itTickets = tour.getTickets().listIterator();
        while(itHoteles.hasNext() ){
            System.out.println(itTickets.next() + " en el " + itHoteles.next());
        }
    }
    
}
