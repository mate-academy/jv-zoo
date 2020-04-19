package core.basesyntax.controller;

public abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("I'm eating.....");
    }
}
