/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.creacionales.singleton;

import globant.talentpod.patrones.Ejemplo;

/**
 * @author carlozandrez
 */
public class EjemploSingleton implements Ejemplo {
    Singleton objetoUno;
    Singleton objetoDos;

    @Override
    public void operacion() {
        objetoUno = Singleton.getInstancia();
        objetoDos = Singleton.getInstancia();
        System.out.println(objetoUno);
        System.out.println(objetoDos);

        System.out.println("Objects are equal: " + objetoDos.equals(objetoUno));
    }

}
