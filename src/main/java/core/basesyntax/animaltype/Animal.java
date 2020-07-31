package core.basesyntax.animaltype;

public abstract class Animal {
    public static String name;
    public static int age;
    public static boolean isFed;

    public Animal(String name, int age, boolean isFed) {
        this.name = name;
        this.age = age;
        this.isFed = false;
    }

    public String getName() {
        return this.name;
    }

    public static void feed(Animal animal) {
        System.out.println(animal.name + " have been fed :)");
        animal.isFed = true;
    }
}
