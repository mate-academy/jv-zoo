package core.basesyntax.animals;

import core.basesyntax.interfaces.Swimable;

public class Tiger extends Animal implements Swimable {

    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(String.format("%s like to eat meat", getName()));
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
