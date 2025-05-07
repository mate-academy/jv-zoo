package core.basesyntax;

public abstract class Animal implements Flyable, Swimmable, Walkable, Feedable {
    private static String color;
    private static int age;

    public Animal(String color, int age) {
        Animal.color = color;
        Animal.age = age;
    }

}

