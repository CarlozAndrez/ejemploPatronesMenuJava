/*
 * Director del patron
 */
package globant.talentpod.patrones.creacionales.builder;

/**
 * 
 * @author carlozandrez
 */
public class Agencia {
    private ConstructorTour constructor;

    public void setConstructor(ConstructorTour constructor) {
        this.constructor = constructor;
    }
    
    public Tour getTour(){
        return constructor.getTour();
    }
    
    public void construirTour(){
        constructor.construirTour();
        constructor.construirHoteles();
        constructor.construirTickets();
    }
    
}
