package core.basesyntax.animal;

import core.basesyntax.interfaces.Swimmable;

public class Shark extends Animal implements Swimmable {
    public Shark(String name, int age, boolean isRare) {
        super(name, age, isRare);
    }

    @Override
    public void swim() {
        System.out.println("Shark is swimming");
    }

    @Override
    void feed() {
        System.out.println("Give shark inter TV");
    }
}
