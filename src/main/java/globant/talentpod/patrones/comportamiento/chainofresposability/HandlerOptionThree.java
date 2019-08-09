/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.chainofresposability;

/**
 *
 * @author carlozandrez
 */
public class HandlerOptionThree extends Handler{

    @Override
    public void handlerRequest(int opt) {
        if(opt == 3){
            System.out.println("Martes");
        }else{
            successor.handlerRequest(opt);
        }
    }
    
}
