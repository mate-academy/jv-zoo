package core.basesyntax;

public class Zoo {

    public static void main(String[] args) {

        Animal tiger = new Tiger();
        Animal sparrow = new Sparrow();
        Animal shark = new Shark();
        Animal penguin = new Penguin();

        Animal[] animals = new Animal[]{tiger, sparrow, shark, penguin};
        for (Animal animal: animals) {
            animal.goHome();
            animal.feed();
        }

    }
}
