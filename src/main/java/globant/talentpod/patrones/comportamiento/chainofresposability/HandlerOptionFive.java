/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.chainofresposability;

/**
 *
 * @author carlozandrez
 */
public class HandlerOptionFive extends Handler{

    @Override
    public void handlerRequest(int opt) {
        if(opt == 5){
            System.out.println("Jueves");
        }else{
            successor.handlerRequest(opt);
        }
    }
    
}
