/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.chainofresposability;

/**
 *
 * @author carlozandrez
 */
public class HandlerOptionSeven extends Handler{

    @Override
    public void handlerRequest(int opt) {
        if(opt == 7){
            System.out.println("Sabado");
        }else{
            successor.handlerRequest(opt);
        }
    }
    
}
