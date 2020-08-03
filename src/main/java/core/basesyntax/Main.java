package core.basesyntax;

import static core.basesyntax.Zoo.addAnimal;
import static core.basesyntax.Zoo.addBird;
import static core.basesyntax.Zoo.addSwimmable;
import static core.basesyntax.Zoo.feedAnimals;
import static core.basesyntax.Zoo.getAnimalHouse;
import static core.basesyntax.Zoo.moveAnimals;

public class Main {
    public static void main(String[] args) {
        Animal shark = new Shark("Dexter", 5);
        addAnimal(shark);
        addSwimmable((Swimmable) shark);

        Animal tiger = new Tiger("Moon", 8);
        addAnimal(tiger);

        Animal penguin = new Penguin("Chop", 2);
        addAnimal(penguin);
        addSwimmable((Swimmable) penguin);

        Bird sparrow = new Sparrow("Birdie", 1);
        addAnimal(sparrow);
        addBird(sparrow);

        feedAnimals(getAnimalHouse());
        moveAnimals(getAnimalHouse());
    }
}
