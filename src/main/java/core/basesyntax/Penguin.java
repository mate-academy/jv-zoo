package core.basesyntax;

import core.basesyntax.interfaces.Swimmable;

public class Penguin extends Bird implements Swimmable, Runnable {

    public Penguin(String name, int age) {
        this.name = name;
        this.age = age;
        allAnimals.add(Penguin.this);
    }

    public String habitat() {
        return "Aquarium";
    }

    @Override
    public void swim() {
        System.out.println("I like swimming.");
    }

    @Override
    public void run() {
        System.out.println("I can run.But not very fast =) ");
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
