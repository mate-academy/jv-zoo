package core.basesyntax;

import core.basesyntax.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(String name, int age) {
        this.name = name;
        this.age = age;
        allAnimals.add(Sparrow.this);
    }

    public String habitat() {
        return "Aviary";
    }

    @Override
    public void fly() {
        System.out.println("I can fly.");
    }

    @Override
    public void eat() {
        System.out.println("Mmmm... Yummy seeds.");
    }

    @Override
    public String toString() {
        return "Hi! I'm " + name + ". I live in aviary";
    }
}
