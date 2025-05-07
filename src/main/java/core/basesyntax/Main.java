package core.basesyntax;

import core.basesyntax.model.Penguin;
import core.basesyntax.model.Shark;
import core.basesyntax.model.Sparrow;
import core.basesyntax.model.Tiger;
import core.basesyntax.type.Animal;
import core.basesyntax.type.Bird;
import core.basesyntax.type.Fish;
import core.basesyntax.type.Flying;
import core.basesyntax.type.Swimming;

public class Main {

    public static void main(String[] args) {
        Animal tiggo = new Tiger("Tiggo", true);
        Bird pin = new Penguin("King Ping", false);
        Bird spar = new Sparrow("Spark", true);
        Fish fish = new Shark("Sharky", true);

        Zoo newZoo = new Zoo();

        newZoo.addToAnimalAviary(tiggo);
        newZoo.addToAquarium((Swimming) pin);
        newZoo.addToAquarium(fish);
        newZoo.addToBirdAviary((Flying) spar);

        tiggo.eat();
        pin.eat();
        fish.eat();
        spar.eat();

        System.out.println(newZoo.getAquariumInhabitants());
        System.out.println(newZoo.getAnimalAviaryInhabitants());
        System.out.println(newZoo.getBirdAviaryInhabitants());
    }
}
