package core.basesyntax.animal;

import core.basesyntax.abstracts.Bird;
import core.basesyntax.interfaces.Swimable;

public class Penguin extends Bird implements Swimable {

    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swiming");
    }

    @Override
    public void eating() {
        System.out.println("Penguin " + name + " is eating");
    }

    @Override
    public String toString() {
        return "Penguin " + name + ". He is " + age + " years old.";
    }
}
