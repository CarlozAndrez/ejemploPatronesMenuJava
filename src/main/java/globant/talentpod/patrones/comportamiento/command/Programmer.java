/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.comportamiento.command;

/**
 *
 * @author carlozandrez
 */
public class Programmer implements Command {

    public void execute() {
        System.out.println("sell the bugs, charge extra for the fixes");
    }
}
