package core.basesyntax;

import core.basesyntax.abilities.FlyAble;
import core.basesyntax.abilities.SwimmingAble;
import core.basesyntax.abilities.WalkAble;
import core.basesyntax.abstractanimals.Animal;
import core.basesyntax.animals.Penguin;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<? super FlyAble> cageForFlyingBirds;
    List<? super SwimmingAble> aquarium;
    List<? super WalkAble> aviary;

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

    public void addAnimal(Penguin penguin) {
        aviary.add(penguin);
    }

    public void showWhatAnimalsAbleTo() {
        cageForFlyingBirds.forEach(a -> ((Animal) a).showSpecialAbility());
        aviary.forEach(a -> ((Animal) a).showSpecialAbility());
        aquarium.forEach(a -> ((Animal) a).showSpecialAbility());
    }

    public void feedAllAnimals() {
        cageForFlyingBirds.forEach(a -> ((Animal) a).eat());
        aviary.forEach(a -> ((Animal) a).eat());
        aquarium.forEach(a -> ((Animal) a).eat());
    }
}
