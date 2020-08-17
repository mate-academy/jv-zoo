package core.basesyntax;

import core.basesyntax.animals.Aviary;
import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;
import core.basesyntax.kind.Bird;
import core.basesyntax.kind.Fishes;
import core.basesyntax.kind.LandAnimal;

public class MainApp {
    public static void main(String[] args) {
        Bird penguin = new Penguin("Afanasii", 11);
        Aviary.penguinAquarium.add(penguin);
        penguin.eat();

        Bird sparrow = new Sparrow("Kesha", 7);
        Aviary.birdsAviary.add(sparrow);
        sparrow.eat();

        Fishes shark = new Shark("Reggae-shark", 6);
        Aviary.fishesAquarium.add(shark);
        shark.eat();

        LandAnimal tiger = new Tiger("Varfolomei", 4);
        Aviary.landAnimalAviary.add(tiger);
        tiger.eat();
    }
}
