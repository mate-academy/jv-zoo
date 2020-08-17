package core.basesyntax.animals;

public abstract class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eat...");
    }

    @Override
    public String toString() {
        return "Animal{"
                + "name='"
                + name + '\''
                + ", age="
                + age
                + '}';
    }
}
