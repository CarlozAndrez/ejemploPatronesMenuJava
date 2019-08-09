/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.chainofresposability;

/**
 *
 * @author carlozandrez
 */
public abstract class Handler {
    Handler successor;
    
    public abstract void handlerRequest(int opt);

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
        
    
    
}
