package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    static List<Animal> allAnimals = new ArrayList();
    protected String name;
    protected int age;

    public String typeOfTheAnimal() {
        return "Type of the animal";
    }

    public String habitat() {
        return "Habitat of the animal";
    }

    @Override
    public String toString() {
        return typeOfTheAnimal();
    }

    public abstract void eat();
}
