package core.basesyntax.abstractanimals;

import core.basesyntax.abilities.EatAble;
import java.util.Objects;

public abstract class Animal implements EatAble {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void showSpecialAbility();

    @Override
    public void eat() {
        System.out.println(String.format("%s %s is eating.",
                this.getClass().getSimpleName(), name));
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal animal = (Animal) o;
        return age == animal.age
                && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
