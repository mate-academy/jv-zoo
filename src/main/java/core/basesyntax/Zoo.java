package core.basesyntax;

import core.basesyntax.models.Animal;
import core.basesyntax.models.Bird;
import core.basesyntax.models.Fish;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo {
    private List<Animal> animals;
    private List<? super Fish> fishArea = new ArrayList<>();
    private List<? super Bird> birdArea = new ArrayList<>();
    private List<Animal> otherArea = new ArrayList<>();

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public void leadToArea() {
        List<Bird> birds = animals.stream()
                .filter(animal -> animal instanceof Bird)
                .map(animal -> (Bird) animal).collect(Collectors.toList());
        birdArea.addAll(birds);
        List<Fish> fishes = animals.stream()
                .filter(animal -> animal instanceof Fish)
                .map(animal -> (Fish) animal).collect(Collectors.toList());
        fishArea.addAll(fishes);
        List<Animal> otherAnimals = new ArrayList<>(animals);
        otherAnimals.removeAll(fishes);
        otherAnimals.removeAll(birds);
        otherArea.addAll(otherAnimals);
    }

    public void feedAnimals() {
        System.out.print("Bird area: \n");
        List<? extends Bird> birds = new ArrayList(birdArea);
        birds.forEach(Bird::eat);
        System.out.print("Fish area: \n");
        List<? extends Fish> fishes = new ArrayList(fishArea);
        fishes.forEach(Fish::eat);
        System.out.print("Other area: \n");
        otherArea.forEach(Animal::eat);
    }
}
