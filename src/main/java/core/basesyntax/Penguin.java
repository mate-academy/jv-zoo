package core.basesyntax;

public class Penguin extends WaterAnimals implements Swimmable {

    @Override
    public void swim() {
        System.out.println("The penguin is swimming");
    }

    @Override
    public void feed() {
        System.out.println("The penguin is eating");
    }
}
