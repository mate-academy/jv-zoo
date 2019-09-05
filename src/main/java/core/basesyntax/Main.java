package core.basesyntax;

import core.basesyntax.animals.Animals;
import core.basesyntax.animals.Birds;
import core.basesyntax.animals.Fishes;
import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;
import core.basesyntax.buildings.Aquarium;
import core.basesyntax.buildings.Aviary;
import core.basesyntax.buildings.Enclosure;
import core.basesyntax.buildings.Zoo;
import core.basesyntax.skills.Fly;
import core.basesyntax.skills.Swim;

public class Main {
    public static void main(String[] args) {
        Aquarium<Fishes> aquarium = new Aquarium<>();
        Shark shark = new Shark("Bit");
        aquarium.setAnimal(shark);
        Penguin penguin = new Penguin("Lucky");
        Sparrow sparrow = new Sparrow("Quick");
        Aviary<Birds> aviary = new Aviary<>();
        aviary.setAnimal(penguin);
        aviary.setAnimal(sparrow);
        Tiger tiger = new Tiger("Sad");
        Enclosure<Tiger> enclosure = new Enclosure<>();
        enclosure.setAnimal(tiger);

        Zoo zoo = new Zoo(aviary, enclosure,aquarium);

        Animals anyAnimals = tiger;
        tiger.eat();
        anyAnimals = sparrow;
        anyAnimals.eat();
        anyAnimals = shark;
        anyAnimals.eat();
        anyAnimals = penguin;
        penguin.eat();

        Fly fly = sparrow;
        fly.flying();

        Swim swim = shark;
        swim.swimming();
        swim = penguin;
        penguin.swimming();
    }
}
