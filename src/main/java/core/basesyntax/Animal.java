package core.basesyntax;

import java.util.ArrayList;

public abstract class Animal {
    static ArrayList<Animal> allAnimals = new ArrayList();
    String name;
    int age;
    String habitat;

    public abstract void eat();
}
