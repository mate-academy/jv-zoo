package core.basesyntax;

public abstract class ResidentsOfTheZoo {

    private String name;
    private int age;

    public ResidentsOfTheZoo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public  abstract void displayInfo();

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }
}
