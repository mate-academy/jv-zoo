package core.basesyntax;

import java.util.ArrayList;

public class Zoo {
    public void createAnimal() {
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Tiger());
        zoo.add(new Penguin());
        zoo.add(new Sparrow());
        zoo.add(new Shark());

        for (Animal animal : zoo) {
            animal.feed();
            if (animal instanceof Floating) {
                ((Floating) animal).swim();
            }
            if (animal instanceof Flying) {
                ((Flying) animal).fly();
            }
        }
    }
}
