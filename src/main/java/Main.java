import core.basesyntax.Zoo;
import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;
import core.basesyntax.animaltype.Animal;
import core.basesyntax.animaltype.Bird;
import core.basesyntax.animaltype.Fish;
import core.basesyntax.animaltype.OtherAnimals;

public class Main {
    public static void main(String[] args) {
        Penguin penguin = new Penguin("Harry the Penguin", 3);
        Zoo.aquarium.add(penguin);
        System.out.println(penguin.getName() + " was placed to the aquarium");
        Animal.feed(penguin);
        System.out.print(penguin.getName() + " says: ");
        penguin.fly();
        penguin.walk();

        Fish shark = new Shark("Eve the Shark", 7);
        Zoo.aquarium.add(shark);
        System.out.println(shark.getName() + " was placed to aquarium");
        Animal.feed(shark);
        System.out.print(shark.getName() + " says: ");
        shark.swim();

        Bird sparrow = new Sparrow("Mini the Sparrow", 1);
        Zoo.birdsCage.add(sparrow);
        System.out.println(sparrow.getName() + " was placed to the birds cage");
        Animal.feed(sparrow);
        System.out.print(sparrow.getName() + " says: ");
        sparrow.fly();
        sparrow.walk();

        OtherAnimals tiger = new Tiger("Alice the Tiger", 10);
        Animal.feed(tiger);
        Zoo.cage.add(tiger);
        System.out.println(tiger.getName() + " was placed to the ground cage");
        System.out.print(tiger.getName() + " says: ");
        tiger.walk();
    }
}
