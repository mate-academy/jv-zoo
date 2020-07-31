package core.basesyntax.animaltype;

import core.basesyntax.Zoo;

public abstract class Animal extends Zoo {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public static void feed(Animal animal) {
        System.out.println(animal.name + " have been fed :)");
    }
}
