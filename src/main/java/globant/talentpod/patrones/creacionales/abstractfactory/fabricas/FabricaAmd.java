/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.creacionales.abstractfactory.fabricas;

import globant.talentpod.patrones.creacionales.abstractfactory.productos.Memoria;
import globant.talentpod.patrones.creacionales.abstractfactory.productos.ProcesadorAmd;
import globant.talentpod.patrones.creacionales.abstractfactory.productos.Procesador;
import globant.talentpod.patrones.creacionales.abstractfactory.productos.Board;
import globant.talentpod.patrones.creacionales.abstractfactory.productos.BoardAmd;
import globant.talentpod.patrones.creacionales.abstractfactory.productos.MemoriaAmd;

/**
 *
 * @author carlozandrez
 */
public class FabricaAmd implements FabricaAbstracta{

    @Override
    public Board crearBoard() {
        return new BoardAmd();
    }

    @Override
    public Memoria crearMemoria() {
        return new MemoriaAmd();
    }

    @Override
    public Procesador crearProcesador() {
        return new ProcesadorAmd();
    }
    
}
