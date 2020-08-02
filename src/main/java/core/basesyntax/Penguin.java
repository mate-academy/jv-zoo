package core.basesyntax;

import core.basesyntax.interfaces.Swimmable;

public class Penguin extends Animal implements Swimmable, Runnable {

    public Penguin(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
        allAnimals.add(Penguin.this);
    }

    public static String habitat() {
        return "I live in aquarium";
    }

    public static String typeOfTheAnimal() {
        return "Penguin";
    }

    @Override
    public void swim() {
        System.out.println("I like swimming.");
    }

    @Override
    public void run() {
        System.out.println("I can run.");
    }

    @Override
    public void eat() {
        System.out.println("Mmmm... Yummy fish.");
    }

    @Override
    public String toString() {
        return typeOfTheAnimal();
    }

}
