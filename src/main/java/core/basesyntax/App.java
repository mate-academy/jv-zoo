package core.basesyntax;

import core.basesyntax.animals.bird.Bird;
import core.basesyntax.animals.bird.Penguin;
import core.basesyntax.animals.bird.Sparrow;
import core.basesyntax.animals.fish.Fish;
import core.basesyntax.animals.fish.Shark;
import core.basesyntax.animals.mammals.Mammals;
import core.basesyntax.animals.mammals.Tiger;
import core.basesyntax.zoo.Aviary;

public class App {
    public static void main(String[] args) {
        Aviary<Fish> aviaryForFish = new Aviary<>();
        Aviary<Mammals> aviaryForMammals = new Aviary<>();
        Aviary<Bird> aviaryForBird = new Aviary<>();

        aviaryForFish.addAnimal(new Shark());
        aviaryForMammals.addAnimal(new Tiger());
        aviaryForBird.addAnimal(new Penguin());
        aviaryForBird.addAnimal(new Sparrow());

        aviaryForFish.feedAnimals();
        aviaryForMammals.feedAnimals();
        aviaryForBird.feedAnimals();

        aviaryForFish.executeAnimalAction();
        aviaryForMammals.executeAnimalAction();
        aviaryForBird.executeAnimalAction();
    }
}
