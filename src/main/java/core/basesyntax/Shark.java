package core.basesyntax;

public class Shark extends WaterAnimals implements Swimmable {

    @Override
    public void swim() {
        System.out.println("The shark is swimming");
    }

    @Override
    public void feed() {
        System.out.println("The shark is eating");
    }
}
