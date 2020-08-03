package animals;

import interfaces.Swimmable;

public class Penguin extends Animal implements Swimmable {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Penguin " + getName() + " is eating small fish");
    }

    @Override
    public void doSwim() {
        System.out.println("Penguin " + getName() + " is swimming in oceanarium");
    }

    @Override
    public void whereDoILive() {
        System.out.println(getName() + " is swimming in oceanarium and bewares of sharks");
    }
}
