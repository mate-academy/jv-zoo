package core.basesyntax.models.animals;

import core.basesyntax.models.interfaces.Swimable;

public class Penguin extends Animal implements Swimable {

    public Penguin(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.printf("Penguin %s is swimming now\n", name);
    }

    @Override
    public void feed() {
        System.out.printf("Penguin %s is eating now\n", name);
    }

    @Override
    public void doSomething() {
        System.out.printf("%s is running now...", this.getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
