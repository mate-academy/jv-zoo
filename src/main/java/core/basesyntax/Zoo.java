package core.basesyntax;

import core.basesyntax.abstractclasses.Animal;
import core.basesyntax.abstractclasses.Bird;
import core.basesyntax.abstractclasses.Fish;
import core.basesyntax.abstractclasses.ZooInhabitant;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Bird> birdcage = new ArrayList<>();
    private List<Animal> aviary = new ArrayList<>();
    private List<Fish> aquarium = new ArrayList<>();

    public void feedZooInhabitants(List<? extends ZooInhabitant> zooInhabitants) {
        for (ZooInhabitant zooInhabitant : zooInhabitants) {
            zooInhabitant.eat();
        }
    }

    public List<Bird> getBirdcage() {
        return birdcage;
    }

    public List<Animal> getAviary() {
        return aviary;
    }

    public List<Fish> getAquarium() {
        return aquarium;
    }
}
