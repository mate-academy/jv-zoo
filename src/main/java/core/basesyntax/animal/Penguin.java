package core.basesyntax.animal;

import core.basesyntax.interfaces.Swimmable;

public class Penguin extends Animal implements Swimmable {
    public Penguin(String name, int age, boolean isRare) {
        super(name, age, isRare);
    }

    @Override
    public void swim() {
        System.out.println("Penguin cant fly, but can swim");
    }

    @Override
    void feed() {
        System.out.println("Give penguin a fish");
    }
}
