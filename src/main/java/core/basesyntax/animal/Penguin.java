package core.basesyntax.animal;

import core.basesyntax.abstracts.Bird;
import core.basesyntax.interfaces.Swimable;

public class Penguin extends Bird implements Swimable {

    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Пингвин плавает");
    }

    @Override
    public void eating() {
        System.out.println("Пингвин " + name + " накормлен");
    }

    @Override
    public String toString() {
        return "Пингвин " + name + " его возраст " + age + " лет.";
    }
}
