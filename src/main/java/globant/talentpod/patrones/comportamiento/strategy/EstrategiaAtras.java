/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.strategy;

/**
 *
 * @author carlozandrez
 */
public class EstrategiaAtras extends Strategy{

    @Override
    public void llenado() {
        for(int i = arreglo.length - 1; i >= 0; i--){
            arreglo[i] = generarAleatorio();
            System.out.println("generando aleatorio para la poscion " + i + " = " + arreglo[i]);
        }
    }
    
}
