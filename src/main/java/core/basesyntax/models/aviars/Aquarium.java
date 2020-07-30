package core.basesyntax.models.aviars;

import core.basesyntax.models.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Animal> fishes;

    public Aquarium(List<Animal> animals) {
        this.fishes = animals;
    }

    public void feedAllFishes(){
        fishes.forEach(a -> a.feed());
    }

    public List<Animal> getFishes() {
        return fishes;
    }

    public void setFishes(List<Animal> fishes) {
        this.fishes = fishes;
    }
}
