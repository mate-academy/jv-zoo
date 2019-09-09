package core.basesyntax;

import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.cells.AnimalsHome;
import core.basesyntax.cells.Aquarium;
import core.basesyntax.cells.BirdsHome;
import core.basesyntax.enumerate.AnimalType;
import core.basesyntax.interfaces.Feedable;
import core.basesyntax.interfaces.Flyable;
import core.basesyntax.interfaces.Swimable;

public class Zoo {
    public static void main(String[] args) {
        AnimalsHome<Feedable> animalsHome = new AnimalsHome<>();
        animalsHome.addAnimal(AnimalType.SPARROW);
        animalsHome.addAnimal(AnimalType.TIGER);
        animalsHome.addAnimal(AnimalType.PENGUIN);
        animalsHome.addAnimal(AnimalType.SHARK);
        animalsHome.feedAll();

        Aquarium<Swimable> aquarium = new Aquarium<>();
        Shark shark = new Shark();
        Penguin penguin = new Penguin();
        aquarium.addWaterfowl(shark);
        aquarium.addWaterfowl(penguin);
        aquarium.feedFish();

        BirdsHome<Flyable> birdsHome = new BirdsHome<>();
        Sparrow sparrow = new Sparrow();
        birdsHome.addBird(sparrow);
    }
}
