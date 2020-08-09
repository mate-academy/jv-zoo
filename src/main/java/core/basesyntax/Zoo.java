package core.basesyntax;

public class Zoo {

    public static void main(String[] args) {

        Animal tiger = new Tiger("Sherhan", 10, "cage");
        Animal sparrow = new Sparrow("Birdy", 3,"poultry-run");
        Animal shark = new Shark("Jaws", 5, "aquarium");
        Animal penguin = new Penguin("Pengui", 1, "aquarium");

        Animal[] animals = new Animal[]{tiger, sparrow, shark, penguin};
        for (Animal animal: animals) {
            animal.goHome();
            animal.feed();
        }

    }
}
