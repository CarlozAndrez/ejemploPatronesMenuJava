/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.estructurales.decorator;

/**
 *
 * @author carlozandrez
 */
public class RealComponent implements Component{

    @Override
    public String doThis() {
        return "Operación del objeto real";
    }
    
}
