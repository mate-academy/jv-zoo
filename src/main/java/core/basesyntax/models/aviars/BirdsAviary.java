package core.basesyntax.models.aviars;

import core.basesyntax.models.animals.Animal;
import java.util.List;

public class BirdsAviary {
    private List<Animal> birds;

    public BirdsAviary(List<Animal> animals) {
        this.birds = animals;
    }


    public void feedAllBirds() {
        birds.forEach(a -> a.feed());
    }

    public List<Animal> getBirds() {
        return birds;
    }

    public void setBirds(List<Animal> birds) {
        this.birds = birds;
    }
}
