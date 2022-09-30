package core.basesyntax;

import core.basesyntax.interfaces.Swimmable;

public class Tiger extends LandAnimal implements Runnable, Swimmable {

    public Tiger(String name, int age) {
        this.name = name;
        this.age = age;
        allAnimals.add(Tiger.this);
    }

    public String habitat() {
        return "Enclosure";
    }

    @Override
    public void swim() {
        System.out.println("I can swim.");
    }

    @Override
    public void run() {
        System.out.println("I can run.");
    }

    @Override
    public void eat() {
        System.out.println("Mmmm... Yummy meat.");
    }

    @Override
    public String toString() {
        return "Hi! I'm " + name + ". I live in enclosure";
    }
}
