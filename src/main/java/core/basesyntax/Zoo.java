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

    public void addAnimals(List<? extends Animal> animals) {
        animals.stream()
                .filter(animal -> animal instanceof FlyAble)
                .forEach(cageForFlyingBirds::addAnimal);
        animals.stream()
                .filter(animal -> animal instanceof SwimmingAble)
                .forEach(cageForFlyingBirds::addAnimal);
        animals.stream()
                .filter(animal -> animal instanceof WalkAble)
                .forEach(cageForFlyingBirds::addAnimal);
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
        private List<Animal> animals;

        private PlaceForAnimals() {
            animals = new ArrayList<>();
        }

        private <T extends Animal> void addAnimal(T animal) {
            animals.add(animal);
        }

        private void showAnimalsSpecialAbility() {
            animals.forEach(Animal::showSpecialAbility);
        }

        private void feedAnimals() {
            animals.forEach(EatAble::eat);
        }

    }
}
