package core.basesyntax.animal;

import core.basesyntax.interfaces.Flyable;

public class Sparrow extends Animal implements Flyable  {
    public Sparrow(String name, int age, boolean isRare) {
        super(name, age, isRare);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    void feed() {
        System.out.println("Give sparrow some seeds");
    }
}
