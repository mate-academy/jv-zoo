package core.basesyntax;

import core.basesyntax.abilities.EatAble;
import core.basesyntax.abilities.FlyAble;
import core.basesyntax.abilities.SpecificAbility;
import core.basesyntax.abilities.SwimmingAble;
import core.basesyntax.abilities.WalkAble;
import core.basesyntax.abstractanimals.Animal;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    PlaceForAnimals<FlyAble> cageForFlyingBirds;
    PlaceForAnimals<SwimmingAble> aquarium;
    PlaceForAnimals<WalkAble> aviary;

    public Zoo() {
        cageForFlyingBirds = new PlaceForAnimals<>();
        aquarium = new PlaceForAnimals<>();
        aviary = new PlaceForAnimals<>();
    }

    public void addAnimal(SwimmingAble animal) {
        aquarium.addAnimal(animal);
    }

    void addAnimal(WalkAble animal) {
        aviary.addAnimal(animal);
    }

    public void addAnimal(FlyAble animal) {
        cageForFlyingBirds.addAnimal(animal);
    }

    public void showWhatAnimalsAbleTo() {
        cageForFlyingBirds.showAnimalsSpecialAbility();
        aquarium.showAnimalsSpecialAbility();
        aviary.showAnimalsSpecialAbility();
    }

    public void feedAllAnimals() {
        cageForFlyingBirds.feedAnimals();
        aquarium.feedAnimals();
        aviary.feedAnimals();
    }

    private static class PlaceForAnimals<T extends SpecificAbility> {
        private List<? super T> animals;

        private PlaceForAnimals() {
            animals = new ArrayList<>();
        }

        private void addAnimal(T animal) {
            animals.add(animal);
        }

        private void showAnimalsSpecialAbility() {
            animals.stream().map(a -> (Animal) a).forEach(Animal::showSpecialAbility);
        }

        private void feedAnimals() {
            animals.stream().map(a -> (Animal) a).forEach(EatAble::eat);
        }

    }
}
