package animals;

import interfaces.Swimmable;

public class Shark extends Animal implements Swimmable {

    public Shark(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Shark " + getName() + " is eating a lot of meat");
    }

    @Override
    public void doSwim() {
        System.out.println("Shark is swimming in oceanarium");
    }

    @Override
    public void whereDoILive() {
        System.out.println(getName() + " lives in oceanarium");
    }
}
