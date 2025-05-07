package core.basesyntax.models.animals;

import core.basesyntax.models.interfaces.Swimable;

public class Shark extends Animal implements Swimable {

    public Shark(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void feed() {
        System.out.printf("Shark %s is eating now\n", name);
    }

    @Override
    public void doSomething() {
        System.out.printf("%s is chilling on the warm water now...",
                this.getClass().getSimpleName());
    }

    @Override
    public void swim() {
        System.out.printf("Shark %s is swimming now\n", name);
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
