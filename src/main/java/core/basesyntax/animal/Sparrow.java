package core.basesyntax.animal;

import core.basesyntax.abstracts.Bird;
import core.basesyntax.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is fly");
    }

    @Override
    public void eating() {
        System.out.println("Sparrow " + name + " is eating");
    }

    @Override
    public String toString() {
        return "Sparrow " + name + ". He is " + age + " years old.";
    }
}
