package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<? super Animal> birdsAviary = new ArrayList<>();
    private List<? super Animal> fishAquarium = new ArrayList<>();
    private List<? super Animal> mammalsAviary = new ArrayList<>();

    public void addAnimals(Bird bird) {
        birdsAviary.add(bird);
    }

    public void addAnimals(Fish fish) {
        fishAquarium.add(fish);
    }

    public void addAnimals(Animal animal) {
        mammalsAviary.add(animal);
    }

    public void feedAnimals(Animal animal) {
        animal.feedAnimal();
    }

    public void printInfo(Animal animal) {
        System.out.println(animal);
    }
}
