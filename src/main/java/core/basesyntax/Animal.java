package core.basesyntax;

abstract public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void feed() {
        System.out.println(name + " has ate standard food.");
    }

    void feed(String s) {
        System.out.println(name + " has ate " + s + "!");
    }

    public String getName() {
        return name;
    }
}
