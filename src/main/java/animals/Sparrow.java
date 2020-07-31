package animals;

import interfaces.Flyable;

public class Sparrow extends Animal implements Flyable {
    private String name;

    public Sparrow(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    @Override
    public void doFly() {
        System.out.println("Sparrow " + getName() + " is flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow " + getName() + " is eating corn");
    }

    @Override
    public void whereDoILive() {
        System.out.println(getName() + " lives in bird aviary");
    }
}
