package core.basesyntax;

public class Bird extends Animal {
    protected String name;
    protected int age;
    protected String habitat;

    public static String typeOfTheAnimal() {
        return "Bird";
    }

    public static String habitat() {
        return "Aviary";
    }

    @Override
    public String toString() {
        return typeOfTheAnimal();
    }

    @Override
    public void eat() {
    }
}
