package core.basesyntax;

import core.basesyntax.animalkind.Penguin;
import core.basesyntax.animalkind.Shark;
import core.basesyntax.animalkind.Sparrow;
import core.basesyntax.animalkind.Tiger;
import core.basesyntax.animaltype.Bird;
import core.basesyntax.animaltype.Fish;
import core.basesyntax.animaltype.Terrestrial;

public class Executor {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Wild West Zoo");
        Aviary<Terrestrial> terrestrialAviary = new Aviary<>();
        Aviary<Bird> birdAviary = new Aviary<>();
        Aviary<Fish> fishAviary = new Aviary<>();
        fishAviary.placeAnimal(new Shark("Bobby"));
        terrestrialAviary.placeAnimal(new Tiger("Tommy"));
        birdAviary.placeAnimal(new Sparrow("Jack"));
        birdAviary.placeAnimal(new Penguin("Skipper"));
        birdAviary.placeAnimal(new Penguin("Kovalski"));
        var aviaries = new Aviary[]{terrestrialAviary, birdAviary, fishAviary};
        for (var aviary : aviaries) {
            myZoo.addAviary(aviary);
        }
        birdAviary.bringAnimalsActivity();
        myZoo.feedAllAnimalsInZoo();
        terrestrialAviary.feedAllInAviary();
        terrestrialAviary.removeAllAnimals();
        myZoo.feedAllAnimalsInZoo();
    }
}
