/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.command;

/**
 *
 * @author carlozandrez
 */
public class Politician implements Command {

    public void execute() {
        System.out.println("take money from the rich, take votes from the poor");
    }
}
