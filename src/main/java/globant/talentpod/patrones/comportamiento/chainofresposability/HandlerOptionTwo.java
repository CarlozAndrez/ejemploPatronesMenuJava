/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.chainofresposability;

/**
 *
 * @author carlozandrez
 */
public class HandlerOptionTwo extends Handler{

    @Override
    public void handlerRequest(int opt) {
        if(opt == 2){
            System.out.println("Lunes");
        }else{
            successor.handlerRequest(opt);
        }
    }
    
}
