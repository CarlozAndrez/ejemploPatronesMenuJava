/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.strategy;

import java.util.Random;

/**
 *
 * @author carlozandrez
 */
public abstract class Strategy {
    public Random rand = new Random();
    public int[] arreglo = new int[10];
    
    public int generarAleatorio(){
        return rand.nextInt(100);
    }
    
    public abstract void llenado();
    
}
