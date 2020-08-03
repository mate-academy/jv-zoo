package core.basesyntax;

import core.basesyntax.interfaces.Swimmable;

public class Penguin extends Bird implements Swimmable, Runnable {

    public Penguin(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
        allAnimals.add(Penguin.this);
    }

    @Override
    public String toString() {
        return typeOfTheAnimal();
    }

    @Override
    public void swim() {
        System.out.println("I like swimming.");
    }

    public static String habitat() {
        return "Aquarium";
    }

    @Override
    public void run() {
        System.out.println("I can run.");
    }

    @Override
    public void eat() {
        System.out.println("Mmmm... Yummy fish.");
    }
}
