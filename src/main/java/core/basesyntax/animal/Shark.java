package core.basesyntax.animal;

import core.basesyntax.interfaces.Swimmable;

public class Shark extends Animal implements Swimmable {
    public Shark(String name, int age, boolean isRare) {
        super(name, age, isRare);
    }

    @Override
    public void swim() {
        System.out.println("Shark is swimming");
    }

    @Override
    public void feed() {
        System.out.println("Give " + getName() + " inter TV");
    }

    @Override
    public String toString() {
        return "Shark: " + getName() + ", age: " + getAge();
    }
}
