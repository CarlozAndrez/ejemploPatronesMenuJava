/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.creacionales.abstractfactory.fabricas;

import globant.talentpod.patrones.creacionales.abstractfactory.productos.Memoria;
import globant.talentpod.patrones.creacionales.abstractfactory.productos.Procesador;
import globant.talentpod.patrones.creacionales.abstractfactory.productos.Board;
import globant.talentpod.patrones.creacionales.abstractfactory.productos.BoardIntel;
import globant.talentpod.patrones.creacionales.abstractfactory.productos.MemoriaIntel;
import globant.talentpod.patrones.creacionales.abstractfactory.productos.ProcesadorIntel;

/**
 *
 * @author carlozandrez
 */
public class FabricaIntel implements FabricaAbstracta{
    
    @Override
    public Board crearBoard() {
        return new BoardIntel();
    }

    @Override
    public Memoria crearMemoria() {
        return new MemoriaIntel();
    }

    @Override
    public Procesador crearProcesador() {
        return new ProcesadorIntel();
    }
}
