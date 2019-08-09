/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.estructurales.proxy;

/**
 *
 * @author carlozandrez
 */
public class Proxy implements Subject{
    private int accesos;

    public Proxy() {
        accesos = 0;
    }
    
    

    @Override
    public String doAction() {
        RealSubject r = new RealSubject();
        accesos++;
        return r.doAction()+" ejecutado "+accesos+" vece(s)";
    }
    
}
