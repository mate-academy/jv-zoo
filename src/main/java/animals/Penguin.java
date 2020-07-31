package animals;

import interfaces.Swimmable;

public class Penguin extends Animal implements Swimmable {
    private String name;

    public Penguin(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
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
