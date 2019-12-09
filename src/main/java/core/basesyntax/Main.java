package core.basesyntax;

import core.basesyntax.animals.*;
import core.basesyntax.behavior.Flyable;
import core.basesyntax.behavior.Swimable;
import core.basesyntax.cages.CageForAllAnimal;
import core.basesyntax.cages.CageForFlying;
import core.basesyntax.cages.CageForSwimming;

public class Main {
    public static void main(String[] args) {
        CageForAllAnimal<Animal> cage = new CageForAllAnimal<>();
        CageForFlying<Flyable> cageForFlying = new CageForFlying<>();
        CageForSwimming<Swimable> cageForSwimming = new CageForSwimming<>();
        Penguin penguin = new Penguin();
        Animal tiger = new Tiger();
        Fish shark = new Shark();
        Bird sparrow = new Sparrow();
        cage.addAnimal(penguin);
        cage.getAnimal();
        cageForFlying.addAnimal(sparrow);
        cageForSwimming.addAnimal(shark);
        penguin.feed();
        tiger.feed();
        shark.feed();
        sparrow.feed();
    }
}
