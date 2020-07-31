package core.basesyntax.models.aviars;

import core.basesyntax.models.animals.Animal;
import java.util.List;

public class AnimalsAviary {
    private List<Animal> animals;

    public AnimalsAviary(List<Animal> animals) {
        this.animals = animals;
    }

    public void feedAnimals() {
        animals.forEach(a -> a.feed());
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
