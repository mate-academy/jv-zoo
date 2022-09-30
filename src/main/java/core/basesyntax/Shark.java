package core.basesyntax;

import core.basesyntax.interfaces.Swimmable;

public class Shark extends Fish implements Swimmable {

    public Shark(String name, int age) {
        this.name = name;
        this.age = age;
        allAnimals.add(Shark.this);
    }

    public String habitat() {
        return "Aquarium";
    }

    @Override
    public void swim() {
        System.out.println("I like swimming.");
    }

    @Override
    public void eat() {
        System.out.println("Mmmm... Yummy fish.");
    }

    @Override
    public String toString() {
        return "Hi! I'm " + name + ". I live in aquarium";
    }
}
