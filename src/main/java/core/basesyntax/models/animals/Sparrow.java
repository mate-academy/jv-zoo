package core.basesyntax.models.animals;

import core.basesyntax.models.interfaces.Flyable;

public class Sparrow extends Animal implements Flyable {

    public Sparrow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void feed() {
        System.out.printf("Sparrow %s is eating now\n", name);
    }

    @Override
    public void doSomething() {
        System.out.printf("%s is sitting on the stick now...", this.getClass().getSimpleName());
    }

    @Override
    public void fly() {
        System.out.printf("Sparrow %s is flying now\n", name);
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
