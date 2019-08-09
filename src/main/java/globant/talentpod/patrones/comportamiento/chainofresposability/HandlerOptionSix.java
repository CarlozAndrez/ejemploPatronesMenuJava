/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.chainofresposability;

/**
 *
 * @author carlozandrez
 */
public class HandlerOptionSix extends Handler{

    @Override
    public void handlerRequest(int opt) {
        if(opt == 6){
            System.out.println("Viernes");
        }else{
            successor.handlerRequest(opt);
        }
    }
    
}
