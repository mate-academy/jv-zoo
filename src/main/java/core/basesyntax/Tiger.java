package core.basesyntax;

import core.basesyntax.interfaces.Swimmable;

public class Tiger extends Animal implements Runnable, Swimmable {

    public Tiger(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
        allAnimals.add(Tiger.this);
    }

    public static String typeOfTheAnimal() {
        return "Tiger";
    }

    public static String habitat() {
        return "I live in enclosure";
    }

    @Override
    public void swim() {
        System.out.println("I can swim.");
    }

    @Override
    public void run() {
        System.out.println("I can run.");
    }

    @Override
    public void eat() {
        System.out.println("Mmmm... Yummy meat.");
    }

    @Override
    public String toString() {
        return typeOfTheAnimal();
    }
}
