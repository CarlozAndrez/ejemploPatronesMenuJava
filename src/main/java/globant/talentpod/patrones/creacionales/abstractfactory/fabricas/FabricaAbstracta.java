/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.creacionales.abstractfactory.fabricas;

import globant.talentpod.patrones.creacionales.abstractfactory.productos.Procesador;
import globant.talentpod.patrones.creacionales.abstractfactory.productos.Memoria;
import globant.talentpod.patrones.creacionales.abstractfactory.productos.Board;

/**
 *
 * @author carlozandrez
 */
public interface FabricaAbstracta {

    public Board crearBoard();

    public Memoria crearMemoria();

    public Procesador crearProcesador();
}
