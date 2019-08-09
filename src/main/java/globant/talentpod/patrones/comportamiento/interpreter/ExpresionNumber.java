/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.interpreter;

/**
 *
 * @author carlozandrez
 */
public class ExpresionNumber extends Expresion{

    @Override
    public int evaluate() {
        return Integer.parseInt(this.value);
    }
    
}
