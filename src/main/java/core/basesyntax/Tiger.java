package core.basesyntax;

public class Tiger extends LandAnimals{
    @Override
    public void feed() {
        System.out.println("Tiger is eating");
    }

    @Override
    public void behavior() {
        System.out.println("Tiger is walking on land");
    }
}
