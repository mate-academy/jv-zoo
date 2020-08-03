package core.basesyntax;

import java.util.ArrayList;

public abstract class Animal {
    static ArrayList<Animal> allAnimals = new ArrayList();
    protected String name;
    protected int age;
    protected String habitat;

    public static String typeOfTheAnimal() {
        return "Type of the animal";
    }

    public static String habitat() {
        return "Area of living";
    }

    @Override
    public String toString() {
        return typeOfTheAnimal();
    }

    public abstract void eat();
}
