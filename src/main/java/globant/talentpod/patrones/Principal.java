/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones;

import java.util.Scanner;
import globant.talentpod.patrones.comportamiento.chainofresposability.EjemploChainOfResponsability;
import globant.talentpod.patrones.comportamiento.command.EjemploCommand;
import globant.talentpod.patrones.comportamiento.interpreter.EjemploInterpreter;
import globant.talentpod.patrones.comportamiento.iterator.EjemploIterator;
import globant.talentpod.patrones.comportamiento.mediator.EjemploMediator;
import globant.talentpod.patrones.comportamiento.memento.EjemploMemento;
import globant.talentpod.patrones.comportamiento.observer.EjemploObserver;
import globant.talentpod.patrones.comportamiento.state.EjemploState;
import globant.talentpod.patrones.comportamiento.strategy.EjemploStrategy;
import globant.talentpod.patrones.comportamiento.templatemethod.EjemploTemplateMethod;
import globant.talentpod.patrones.comportamiento.visitor.EjemploVisitor;
import globant.talentpod.patrones.creacionales.abstractfactory.EjemploAbstractFactory;
import globant.talentpod.patrones.creacionales.builder.EjemploBuilder;
import globant.talentpod.patrones.creacionales.factorymethod.EjemploFactoryMethod;
import globant.talentpod.patrones.creacionales.prototype.EjemploPrototype;
import globant.talentpod.patrones.creacionales.singleton.EjemploSingleton;
import globant.talentpod.patrones.creacionales.singleton.pool.EjemploPoolCajero;
import globant.talentpod.patrones.estructurales.adapter.EjemploAdapter;
import globant.talentpod.patrones.estructurales.bridge.EjemploBridge;
import globant.talentpod.patrones.estructurales.composite.EjemploComposite;
import globant.talentpod.patrones.estructurales.decorator.EjemploDecorator;
import globant.talentpod.patrones.estructurales.facade.EjemploFacade;
import globant.talentpod.patrones.estructurales.flyweight.EjemploFlyweight;
import globant.talentpod.patrones.estructurales.proxy.EjemploProxy;

/**
 *
 * @author carlozandrez
 */
public class Principal {

    public static void main(String[] args) {
        Ejemplo ejemplo = null;
        int opcion = 0;
        int maxOpc = 17;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero entre 0 y " + maxOpc
                    + " para ver un ejemplo de patrones: ");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > maxOpc);
        String patron = "";

        switch (opcion) {
            //Creacionales
            case 0:
                patron = "Singleton";
                ejemplo = new EjemploSingleton();
                break;
            case 1:
                patron = "AbstractFactory";
                ejemplo = new EjemploAbstractFactory();
                break;
            case 2:
                patron = "FactoryMethod";
                ejemplo = new EjemploFactoryMethod();
                break;
            case 3:
                patron = "Pool";
                ejemplo = new EjemploPoolCajero();
                break;
            case 4:
                patron = "Prototype";
                ejemplo = new EjemploPrototype();
                break;
            case 5:
                patron = "Builder";
                ejemplo = new EjemploBuilder();
                break;
            //Estructurales
            case 6:
                patron = "Facade";
                ejemplo = new EjemploFacade();
                break;
            case 7:
                patron = "Adapter";
                ejemplo = new EjemploAdapter();
                break;
            case 8:
                patron = "Proxy";
                ejemplo = new EjemploProxy();
                break;
            case 9:
                patron = "Decorator";
                ejemplo = new EjemploDecorator();
                break;
            case 10:
                patron = "Composite";
                ejemplo = new EjemploComposite();
                break;
            case 11:
                patron = "Bridge";
                ejemplo = new EjemploBridge();
                break;
            case 12:
                patron = "Flyweight";
                ejemplo = new EjemploFlyweight();
                break;
            //comportamiento
            case 13:
                patron = "Template Method";
                ejemplo = new EjemploTemplateMethod();
                break;
            case 14:
                patron = "Strategy";
                ejemplo = new EjemploStrategy();
                break;
            case 15:
                patron = "Interpreter";
                ejemplo = new EjemploInterpreter();
                break;
            case 16:
                patron = "Chain of responsability";
                ejemplo = new EjemploChainOfResponsability();
                break;
            case 17:
                patron = "Command";
                ejemplo = new EjemploCommand();
                break;
            //no implementados
            case 18:
                patron = "Visitor";
                ejemplo = new EjemploVisitor();
                break;
            case 19:
                patron = "State";
                ejemplo = new EjemploState();
                break;
            case 20:
                patron = "Observer";
                ejemplo = new EjemploObserver();
                break;
            case 21:
                patron = "Memento";
                ejemplo = new EjemploMemento();
                break;
            case 22:
                patron = "Mediator";
                ejemplo = new EjemploMediator();
                break;
            case 23:
                patron = "Iteraor";
                ejemplo = new EjemploIterator();
                break;
        }

        System.out.println("Patron: '" + patron + "'");
        ejemplo.operacion();

    }
}
