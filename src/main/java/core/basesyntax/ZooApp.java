package core.basesyntax;

import core.basesyntax.abstracts.Animal;
import core.basesyntax.abstracts.Aviary;
import core.basesyntax.animal.Penguin;
import core.basesyntax.animal.Shark;
import core.basesyntax.animal.Sparrow;
import core.basesyntax.animal.Tiger;
import core.basesyntax.aviary.Aquarium;
import core.basesyntax.aviary.AviaryForBirds;
import core.basesyntax.aviary.AviaryForLandAnimal;
import java.util.List;

public class ZooApp {

    public static void main(String[] args) {
        AviaryForBirds birdAviary = new AviaryForBirds(new Sparrow("Jeck", 5));
        Aquarium<Shark> aquariumForSharks = new Aquarium<>(new Shark("Johny", 45));
        Aquarium<Penguin> aquariumForPenguin = new Aquarium<>(new Penguin("Kovalsky", 10));
        AviaryForLandAnimal aviaryTiger = new AviaryForLandAnimal(new Tiger("Sher-Hun", 7));
        Zoo zoo = new Zoo();
        zoo.setAviaries(List.of(birdAviary, aquariumForSharks, aquariumForPenguin, aviaryTiger));
        for (Aviary<? extends Animal> aviary : zoo.getAviaries()) {
            Animal animal = aviary.getAnimal();
            System.out.println(animal);
            animal.eating();
        }
    }
}
