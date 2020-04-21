package core.basesyntax;

import core.basesyntax.animals.Animal;
import core.basesyntax.zoo.parts.Aviary;
import core.basesyntax.zoo.parts.Birdcage;
import core.basesyntax.zoo.parts.SwimmingPool;

public class ZooPark extends SwimmingPool {
    private Aviary aviary;
    private SwimmingPool swimmingPool;
    private Birdcage birdcage;

    public ZooPark() {
        aviary = new Aviary();
        swimmingPool = new SwimmingPool();
        birdcage = new Birdcage();
    }

    public void feedAll() {
        for (Object animal : aviary.getAllAnimal()) {
            Animal animal1 = (Animal)animal;
            animal1.eat();
        }
        for (Object animal : birdcage.getAllAnimal()) {
            Animal animal1 = (Animal)animal;
            animal1.eat();
        }
        for (Object animal : swimmingPool.getAllAnimal()) {
            Animal animal1 = (Animal)animal;
            animal1.eat();
        }
    }
}
