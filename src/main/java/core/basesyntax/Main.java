package core.basesyntax;

import core.basesyntax.model.Penguin;
import core.basesyntax.model.Shark;
import core.basesyntax.model.Sparrow;
import core.basesyntax.model.Tiger;
import core.basesyntax.type.Animals;
import core.basesyntax.type.Birds;
import core.basesyntax.type.Fishes;

public class Main {

    public static void main(String[] args) {
        Animals tiggo = new Tiger("Tiggo", true);
        tiggo.eat();
        Zoo<Animals> newOne = new Zoo<>(tiggo);
        newOne.add(tiggo);
        Birds pin = new Penguin("King Ping", false);
        pin.eat();
        pin.fly();
        Zoo<Birds> another = new Zoo<>(pin);
        another.add(pin);
        Birds spar = new Sparrow("Spark", true);
        Zoo<Birds> oneMore = new Zoo<>(spar);
        oneMore.add(spar);
        Fishes fish = new Shark("Sharky", true);
        fish.eat();
        Zoo<Fishes> more = new Zoo<>(fish);
        more.add(fish);
        System.out.println(another.getAquariumInhabitants());
        System.out.println(newOne.getAnimalAviaryInhabitants());
        System.out.println(newOne.getBirdsAviaryInhabitants());
    }
}
