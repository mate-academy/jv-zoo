package core.basesyntax.animal;

import core.basesyntax.abstracts.Fish;

public class Shark extends Fish {

    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Акула плавает");
    }

    @Override
    public void eating() {
        System.out.println("Акула " + name + " накормлена");
    }

    @Override
    public String toString() {
        return "Акула " + name + " возраст " + age + " лет.";
    }
}
