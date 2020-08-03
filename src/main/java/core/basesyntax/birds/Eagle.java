package core.basesyntax.birds;

import core.basesyntax.interfaces.FlyBehavior;

public class Eagle extends Bird implements FlyBehavior {

    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(String.format("%s like to eat meat, and fish", getName()));
    }

    @Override
    public void displayInfo() {
        System.out.println("ResidentsOfTheZoo {name = " + getName() + " , age = " + getAge() + "}");
        fly();
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
