/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.creacionales.builder;

import java.util.ArrayList;

/**
 *
 * @author carlozandrez
 */
public class Tour {
    private ArrayList<String> hoteles = new ArrayList<String>();
    private ArrayList<String> tickets = new ArrayList<String>();
    
    public void addHotel(String h){
        hoteles.add(h);
    }
    
    public void addTicket(String t){
        tickets.add(t);
    }

    public ArrayList<String> getHoteles() {
        return hoteles;
    }

    public ArrayList<String> getTickets() {
        return tickets;
    }
      
    
}
