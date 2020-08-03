package core.basesyntax;

public abstract class Mammal extends Animal {
    protected String name;
    protected int age;
    protected String habitat;

    public static String typeOfTheAnimal() {
        return "Mammal";
    }

    public static String habitat() {
        return "Enclosure";
    }

    @Override
    public String toString() {
        return typeOfTheAnimal();
    }

    @Override
    public void eat() {
    }
}
