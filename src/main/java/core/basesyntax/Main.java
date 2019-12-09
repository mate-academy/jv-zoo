package core.basesyntax;

import core.basesyntax.animals.Animal;
import core.basesyntax.animals.Bird;
import core.basesyntax.animals.Fish;
import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;
import core.basesyntax.behavior.Flyable;
import core.basesyntax.behavior.Swimable;
import core.basesyntax.cages.CageForAllAnimal;
import core.basesyntax.cages.CageForFlying;
import core.basesyntax.cages.CageForSwimming;

public class Main {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.feed();
        Animal tiger = new Tiger();
        tiger.feed();
        Fish shark = new Shark();
        shark.feed();
        Bird sparrow = new Sparrow();
        sparrow.feed();
        CageForAllAnimal<Animal> cage = new CageForAllAnimal<>();
        cage.addAnimal(tiger);
        cage.getAnimal();
        CageForFlying<Flyable> cageForFlying = new CageForFlying<>();
        cageForFlying.addAnimal(sparrow);
        CageForSwimming<Swimable> cageForSwimming = new CageForSwimming<>();
        cageForSwimming.addAnimal(penguin);
    }
}
