package core.basesyntax;

import core.basesyntax.animals.Aviaries;
import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;
import core.basesyntax.kind.Birds;
import core.basesyntax.kind.Fishes;
import core.basesyntax.kind.LandAnimal;

public class MainApp {
    public static void main(String[] args) {
        Birds penguin = new Penguin("Afanasii", 11);
        Aviaries.penguinAquarium.add(penguin);
        penguin.eating();

        Birds sparrow = new Sparrow("Kesha", 7);
        Aviaries.birdsAviary.add(sparrow);

        Fishes shark = new Shark("Reggae-shark", 6);
        Aviaries.fishesAquarium.add(shark);

        LandAnimal tiger = new Tiger("Varfolomei", 4);
        Aviaries.landAnimalAviary.add(tiger);
    }
}
