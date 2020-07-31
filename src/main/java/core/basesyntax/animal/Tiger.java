package core.basesyntax.animal;

import core.basesyntax.abstracts.LandAnimal;

public class Tiger extends LandAnimal {

    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void eating() {
        System.out.println("Tiger " + name + " is eating");
    }

    @Override
    public String toString() {
        return "Tiger " + name + ". He is " + age + " years old.";
    }
}
