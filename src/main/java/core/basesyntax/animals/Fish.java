package core.basesyntax.animals;

import core.basesyntax.Animal;
import core.basesyntax.animals.interfaces.IFish;

public class Fish extends Animal implements IFish {

    public Fish(String type, int age, long id) {
        super(type, age, id);
    }

    @Override
    public void swim() {
        System.out.println("bul'-bul'");
    }
}
