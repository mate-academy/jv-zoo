package core.basesyntax.zoo.task;

import core.basesyntax.zoo.task.animals.Animal;
import core.basesyntax.zoo.task.animals.interfaces.AbleToMoveOnTheLand;
import core.basesyntax.zoo.task.animals.interfaces.Flyable;
import core.basesyntax.zoo.task.animals.interfaces.Swimable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo {
    private List<Animal> animals;
    private Aviary<Flyable> birdsAviary;
    private Aviary<AbleToMoveOnTheLand> generalAviary;
    private Aviary<Swimable> aquarium;

    public Zoo(List<Animal> animals) {
        this.animals = new ArrayList<>();
        this.animals.addAll(animals);

        birdsAviary = new Aviary<>();
        generalAviary = new Aviary<>();
        aquarium = new Aviary<>();

        aquarium.addAll(animals.stream()
                .filter(Swimable.class::isInstance)
                .map(Swimable.class::cast)
                .collect(Collectors.toList()));

        this.animals.removeAll(aquarium.getAnimals());

        birdsAviary.addAll(this.animals.stream()
                .filter(Flyable.class::isInstance)
                .map(Flyable.class::cast)
                .collect(Collectors.toList()));

        this.animals.removeAll(birdsAviary.getAnimals());

        generalAviary.addAll(this.animals.stream()
                .filter(AbleToMoveOnTheLand.class::isInstance)
                .map(AbleToMoveOnTheLand.class::cast)
                .collect(Collectors.toList()));
    }

    public void feed(List<? extends Animal> list) {
        list.forEach(Animal::eat);
    }

    public void peek() {
        System.out.format("%18s:   %5s\n", "In birds aviary", birdsAviary.toString());
        System.out.format("%18s:   %5s\n", "In general aviary", generalAviary.toString());
        System.out.format("%18s:   %5s\n\n", "In aquarium", aquarium.toString());
    }
}
