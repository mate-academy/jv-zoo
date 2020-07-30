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
    void feed() {
        System.out.println("Give penguin a fish");
    }
    private void feedItself() {
        System.out.println("Penguin can hunt fish buy himself. But be aware of sharks :)");
    }
}
