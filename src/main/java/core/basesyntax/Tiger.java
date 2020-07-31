package core.basesyntax;

public class Tiger extends LandAnimals{
    public Tiger (String name) {
        this.name = name;
    }

    @Override
    public void feed() {
        System.out.println("Tiger " + name + " is eating");
    }

    @Override
    public void behavior() {
        System.out.println("Tiger " + name + " is walking on land");
    }
}
