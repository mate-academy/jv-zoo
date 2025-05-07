package core.basesyntax.animal;

import core.basesyntax.interfaces.Swimmable;

public class Penguin extends Animal implements Swimmable {
    public Penguin(String name, int age, boolean isRare) {
        super(name, age, isRare);
    }

    @Override
    public void swim() {
        System.out.println("Penguin cant fly, but can swim");
        this.feedItself();
    }

    @Override
    public void feed() {
        System.out.println("Give " + getName() + " fish");
    }

    private void feedItself() {
        System.out.println("Penguin can hunt fish buy himself. But be aware of sharks :)");
    }

    @Override
    public String toString() {
        return "Penguin: " + getName() + ", age: " + getAge();
    }
}
