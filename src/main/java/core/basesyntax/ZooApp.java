package core.basesyntax;

import core.basesyntax.animal.Penguin;
import core.basesyntax.animal.Shark;
import core.basesyntax.animal.Sparrow;
import core.basesyntax.animal.Tiger;

public class ZooApp {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.getLandAnimalAviary().addAnimal(new Tiger());
        zoo.getBirdAviary().addAnimal(new Penguin());
        zoo.getBirdAviary().addAnimal(new Sparrow());
        zoo.getAquarium().addAnimal(new Shark());

        zoo.feedAllAnimals();

        zoo.entertain();
    }
}
