package core.basesyntax;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {
        ArrayList<Mammal> cage = new ArrayList<>();
        ArrayList<Fish> aquarium = new ArrayList<>();
        ArrayList<Bird> birdCage = new ArrayList<>();

        Mammal tiger = new Tiger("Sherhan", 10, "cage");
        Bird sparrow = new Sparrow("Birdy", 3,"poultry-run");
        Fish shark = new Shark("Jaws", 5, "aquarium");
        Bird penguin = new Penguin("Pengui", 1, "aquarium");

        Animal[] animals = new Animal[]{tiger, sparrow, shark, penguin};
        for (Animal animal: animals) {
            if (animal instanceof Mammal) {
                cage.add((Mammal) animal);
            }
            if (animal instanceof Fish) {
                aquarium.add((Fish) animal);
            }
            if (animal instanceof Bird) {
                birdCage.add((Bird) animal);
            }
            animal.feed();
        }
    }
}
