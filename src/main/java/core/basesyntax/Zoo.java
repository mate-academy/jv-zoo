package core.basesyntax;

import core.basesyntax.abilities.FlyAble;
import core.basesyntax.abilities.SwimmingAble;
import core.basesyntax.abilities.WalkAble;
import core.basesyntax.abilities.WalkAndSwimmingAble;
import core.basesyntax.abstractanimals.Animal;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<? super FlyAble> cageForFlyingBirds;
    List<? super SwimmingAble> aquarium;
    List<? super WalkAble> aviary;
    List<? super WalkAndSwimmingAble> aviaryWithWater;

    public Zoo() {
        cageForFlyingBirds = new ArrayList<>();
        aquarium = new ArrayList<>();
        aviary = new ArrayList<>();
    }

    public void addAnimal(SwimmingAble animal) {
        aquarium.add(animal);
    }

    public void addAnimal(WalkAble animal) {
        aviary.add(animal);
    }

    public void addAnimal(FlyAble animal) {
        cageForFlyingBirds.add(animal);
    }

    public void addAnimal(WalkAndSwimmingAble animal) {
        aviaryWithWater.add(animal);
    }

    public void showWhatAnimalsAbleTo() {
        cageForFlyingBirds.forEach(a -> ((Animal) a).showSpecialAbility());
        aviary.forEach(a -> ((Animal) a).showSpecialAbility());
        aquarium.forEach(a -> ((Animal) a).showSpecialAbility());
        aviaryWithWater.forEach(a -> ((Animal) a).showSpecialAbility());
    }

    public void feedAllAnimals() {
        cageForFlyingBirds.forEach(a -> ((Animal) a).eat());
        aviary.forEach(a -> ((Animal) a).eat());
        aquarium.forEach(a -> ((Animal) a).eat());
        aviaryWithWater.forEach(a -> ((Animal) a).eat());
    }
}
