package core.basesyntax.animal;

import core.basesyntax.abstracts.Bird;
import core.basesyntax.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("Воробей летает!");
    }

    @Override
    public void eating() {
        System.out.println("Воробей " + name + " накормлен");
    }

    @Override
    public String toString() {
        return "Воробей " + name + " возраст " + age + " лет.";
    }
}
