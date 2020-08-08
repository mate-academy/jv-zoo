package core.basesyntax;

public abstract class Animal implements Feedable {

    private Name name;
    private int age;
    private int id;

    private static int nextId = 1;

    public Animal(Name name, int age) {
        this.name = name;
        this.age = age;
        this.id = Animal.nextId;
        Animal.nextId += 1;
    }

    public int getId() {
        return id;
    }

    public String eat() {
        return String.format("%s with ID%d is eating", name, id);
    }
}
