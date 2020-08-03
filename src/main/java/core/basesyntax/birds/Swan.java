package core.basesyntax.birds;

import core.basesyntax.interfaces.FlyBehavior;
import core.basesyntax.interfaces.Swimable;

public class Swan extends Bird implements Swimable, FlyBehavior {

    public Swan(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(String.format("%s like to eat aquatic plants", getName()));
    }

    @Override
    public void displayInfo() {
        System.out.println("ResidentsOfTheZoo {name = " + getName() + " , age = " + getAge() + "}");
        swim();
        fly();
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }

    @Override
    public void swim() {
        System.out.println("I can swim!");
    }
}
