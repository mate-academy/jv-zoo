package core.basesyntax;

import core.basesyntax.abstractClasses.Animal;
import core.basesyntax.abstractClasses.Bird;
import core.basesyntax.abstractClasses.Fish;
import core.basesyntax.abstractClasses.ZooInhabitant;

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
