/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.creacionales.singleton;

/**
 *
 * @author carlozandrez
 */
public class Singleton {

    private static Singleton instancia;

    private Singleton() {
    }

    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
}
