package core.basesyntax.animal;

public class Penguin extends Bird implements Swimmable {

    @Override
    public void feed() {
        System.out.println("Penguin is eating.");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming.");
    }
}
