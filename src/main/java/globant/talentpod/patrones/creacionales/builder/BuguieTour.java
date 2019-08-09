/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.creacionales.builder;

/**
 *
 * @author carlozandrez
 */
public class BuguieTour extends ConstructorTour{
    
    @Override
    public void construirTour() {
        tour = new Tour();
    }
    
    @Override
    public void construirHoteles() {
        tour.addHotel("Hilton");
        tour.addHotel("Buckingham Palace");
        tour.addHotel("Holiday Inn");
    }

    @Override
    public void construirTickets() {
        tour.addTicket("Caracas");
        tour.addTicket("Londres");
        tour.addTicket("Madrid");
        
    }

    
    
}
