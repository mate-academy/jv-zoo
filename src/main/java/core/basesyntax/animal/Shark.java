package core.basesyntax.animal;

import core.basesyntax.abstracts.Fish;

public class Shark extends Fish {

    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Shark is swimming");
    }

    @Override
    public void eating() {
        System.out.println("Shark " + name + " is eating");
    }

    @Override
    public String toString() {
        return "Shark " + name + ". He is " + age + " years old.";
    }
}
