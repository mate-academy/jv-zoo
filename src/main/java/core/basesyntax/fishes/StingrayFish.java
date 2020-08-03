package core.basesyntax.fishes;

public class StingrayFish extends Fish {

    public StingrayFish(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(String.format("%s like to eat a little fish", getName()));
    }

    @Override
    public void displayInfo() {
        System.out.println("ResidentsOfTheZoo {name = " + getName() + " , age = " + getAge() + "}");
        swim();
    }
}
