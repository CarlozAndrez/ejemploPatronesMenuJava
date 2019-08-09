/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.chainofresposability;

/**
 *
 * @author carlozandrez
 */
public class HandlerOptionOne extends Handler{

    @Override
    public void handlerRequest(int opt) {
        if(opt == 1){
            System.out.println("Domingo");
        }else{
            successor.handlerRequest(opt);
        }
    }
    
}
