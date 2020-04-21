package core.basesyntax;

import core.basesyntax.animals.Animal;
import core.basesyntax.animals.birds.Bird;
import core.basesyntax.animals.fishes.Fish;
import core.basesyntax.zoo.parts.Aviary;
import core.basesyntax.zoo.parts.Birdcage;
import core.basesyntax.zoo.parts.SwimmingPool;

public class ZooPark extends SwimmingPool {
    private Aviary aviary;
    private SwimmingPool swimmingPool;
    private Birdcage birdcage;

    public ZooPark(Aviary aviary, SwimmingPool swimmingPool, Birdcage birdcage) {
        this.aviary = aviary;
        this.swimmingPool = swimmingPool;
        this.birdcage = birdcage;
    }

    public void feedAll() {
        for (Animal animal : aviary.getAllAnimal()) {
            animal.eat();
        }
        for (Bird bird : birdcage.getAllAnimal()) {
            Animal animal1 = bird;
            animal1.eat();
        }
        for (Fish fish : swimmingPool.getAllAnimal()) {
            fish.eat();
        }
    }
}
