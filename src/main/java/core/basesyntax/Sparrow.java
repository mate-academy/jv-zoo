package core.basesyntax;

import core.basesyntax.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
        allAnimals.add(Sparrow.this);
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
        return typeOfTheAnimal();
    }

    public static String habitat() {
        return "Aviary";
    }
}
