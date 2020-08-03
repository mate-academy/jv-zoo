package core.basesyntax.birds;

import core.basesyntax.interfaces.Swimable;

public class Penguin extends Bird implements Swimable {

    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(String.format("%s like to eat fish", getName()));
    }

    @Override
    public void displayInfo() {
        System.out.println("ResidentsOfTheZoo {name = " + getName() + " , age = " + getAge() + "}");
        swim();
    }

    @Override
    public void swim() {
        System.out.println("I can swim!");
    }
}
