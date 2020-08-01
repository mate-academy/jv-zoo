package core.basesyntax;

import core.basesyntax.interfaces.FlyBehavior;
import core.basesyntax.interfaces.Swimable;

public abstract class ResidentsOfTheZoo {
    public Swimable swimable;
    public FlyBehavior flyBehavior;
    private String name;
    private int age;

    public ResidentsOfTheZoo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public void displayInfo() {
        System.out.println("ResidentsOfTheZoo {name = " + getName() + " , age = " + getAge() + "}");
        performSwim();
        performFly();
    }

    public void performSwim() {
        swimable.swim();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }
}
