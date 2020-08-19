package core.basesyntax;

public abstract class Animal {
    public static int count = 0;
    private String name;
    private int age;
    private String enclosure;

    public Animal(String name, int age, String enclosure) {
        this.name = name;
        this.age = age;
        this.enclosure = enclosure;
        count++;
    }

    public String getEnclosure() {
        return enclosure;
    }

    public String getName() {
        return name;
    }

    public abstract void feed();
}
