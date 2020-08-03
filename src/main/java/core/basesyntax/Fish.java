package core.basesyntax;

public class Fish extends Animal {
    protected String name;
    protected int age;
    protected String habitat;

    public static String typeOfTheAnimal() {
        return "Fish";
    }

    @Override
    public void eat() {
    }
}
