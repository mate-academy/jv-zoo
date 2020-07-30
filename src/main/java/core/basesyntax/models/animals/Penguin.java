package core.basesyntax.models.animals;

import core.basesyntax.models.interfaces.Flyable;
import core.basesyntax.models.interfaces.Swimable;

public class Penguin extends Animal implements Swimable {
    private String name;
    private int age;

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
