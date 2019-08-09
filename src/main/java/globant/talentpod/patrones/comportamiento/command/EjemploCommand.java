/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import globant.talentpod.patrones.Ejemplo;

/**
 *
 * @author carlozandrez
 */
public class EjemploCommand implements Ejemplo {

    @Override
    public void operacion() {
        List queue = produceRequests();
        workOffRequests(queue);
    }

    public static List produceRequests() {
        List queue = new ArrayList();
        queue.add(new DomesticEngineer());
        queue.add(new Politician());
        queue.add(new Programmer());
        return queue;
    }

    public static void workOffRequests(List queue) {
        for (Iterator it = queue.iterator(); it.hasNext();) {
            ((Command) it.next()).execute();
        }
    }
}
