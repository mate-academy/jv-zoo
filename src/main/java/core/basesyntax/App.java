package core.basesyntax;

import core.basesyntax.animals.Animal;
import core.basesyntax.animals.bird.Penguin;
import core.basesyntax.animals.bird.Sparrow;
import core.basesyntax.animals.fish.Fish;
import core.basesyntax.animals.fish.Shark;
import core.basesyntax.animals.mammals.Tiger;
import core.basesyntax.zoo.Aviary;

public class App {
    public static void main(String[] args) {

        Animal penguin = new Penguin();
        penguin.eat();

        Animal sparrow = new Sparrow();
        sparrow.eat();

        Fish shark = new Shark();
        shark.eat();

        Animal tiger = new Tiger();
        tiger.eat();

        Aviary aquarium = new Aviary();
        aquarium.addAnimal(shark);
        aquarium.addAnimal(penguin);

        Aviary birdsAviary = new Aviary();
        birdsAviary.addAnimal(sparrow);

        Aviary common = new Aviary();
        common.addAnimal(tiger);
    }

}
