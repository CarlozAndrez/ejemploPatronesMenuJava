/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package globant.talentpod.patrones.creacionales.prototype.fabrica;

import globant.talentpod.patrones.creacionales.prototype.prototipos.Sheep;
import globant.talentpod.patrones.creacionales.prototype.prototipos.Chicken;
import globant.talentpod.patrones.creacionales.prototype.prototipos.Animal;

/**
 *
 * @author carlozandrez
 */
public class AnimalCreator {
    private Chicken chicken;
    private Sheep sheep;

    public AnimalCreator() {
        chicken = new Chicken();
        sheep = new Sheep();
        
        chicken.setDescription("a litle chicken");
        chicken.setName("chicken");
        chicken.setNumberOfLegs(2);
        
        sheep.setDescription("a litle sheep");
        sheep.setName("sheep");
        sheep.setNumberOfLegs(4);
    }
    
    

    public Animal retrieveAnimal(String kindOfAnimal) {
        if ("Chicken".equals(kindOfAnimal)) {
            return (Animal) chicken.clone();
        } else if ("Sheep".equals(kindOfAnimal)) {
            return (Animal) sheep.clone();
        } // if	

        return null;
    } // method retrieveAnimal
}
