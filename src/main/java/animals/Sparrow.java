package animals;

import interfaces.Flyable;

public class Sparrow extends Animal implements Flyable {

    public Sparrow(String name) {
        super(name);
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
