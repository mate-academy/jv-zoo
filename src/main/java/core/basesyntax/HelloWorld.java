package core.basesyntax;

import core.basesyntax.animals.Fox;
import core.basesyntax.animals.Tiger;
import core.basesyntax.birds.Eagle;
import core.basesyntax.birds.Penguin;
import core.basesyntax.birds.Swan;
import core.basesyntax.fishes.Shark;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addResidentToHabitat(new Tiger("Siberian tiger", 5));
        zoo.addResidentToHabitat(new Fox("American corsac", 8));
        zoo.addResidentToHabitat(new Eagle("Bald eagle", 4));
        zoo.addResidentToHabitat(new Penguin("King penguin", 2));
        zoo.addResidentToHabitat(new Shark("Atelomycterus marmoratus", 3));
        zoo.addResidentToHabitat(new Swan("Whooper swan", 6));

        zoo.showInhabitantsOfTheAviaryOrAquarium(zoo.getAviaryForAnimals());
        zoo.showInhabitantsOfTheAviaryOrAquarium(zoo.getAquariumForFishes());
        zoo.showInhabitantsOfTheAviaryOrAquarium(zoo.getAviaryForBirds());
    }
}
