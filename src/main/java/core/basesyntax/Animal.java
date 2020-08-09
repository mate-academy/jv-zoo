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

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void feed();

    public abstract void goHome();

    public String home() {
        return "Home";
    }
}
