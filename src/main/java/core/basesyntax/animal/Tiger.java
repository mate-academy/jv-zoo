package core.basesyntax.animal;

import core.basesyntax.abstracts.LandAnimal;

public class Tiger extends LandAnimal {

    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void eating() {
        System.out.println("Тигр " + name + " накормлен");
    }

    @Override
    public String toString() {
        return "Тигр " + name + " возраст " + age + " лет.";
    }
}
