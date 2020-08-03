package core.basesyntax;

import core.basesyntax.interfaces.Swimmable;

public class Shark extends Fish implements Swimmable {

    public Shark(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
        allAnimals.add(Shark.this);
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
        return typeOfTheAnimal();
    }

    public static String habitat() {
        return "Aquarium";
    }
}
