/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.chainofresposability;

/**
 *
 * @author carlozandrez
 */
public class HandlerOptionFour extends Handler{

    @Override
    public void handlerRequest(int opt) {
        if(opt == 4){
            System.out.println("Miercoles");
        }else{
            successor.handlerRequest(opt);
        }
    }
    
}
