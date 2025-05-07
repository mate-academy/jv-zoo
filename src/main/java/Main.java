import core.basesyntax.Zoo;
import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;
import core.basesyntax.animaltype.Fish;
import core.basesyntax.animaltype.OtherAnimals;

public class Main {
    public static void main(String[] args) {
        Penguin penguin = new Penguin("Harry the Penguin", 3);
        Zoo.penguinAquarium.add(penguin);
        System.out.println(penguin.getName() + " was placed to the aquarium");
        penguin.feed();
        if (penguin.isFed) {
            System.out.println(penguin.getName() + " is fed now");
        }
        System.out.print(penguin.getName() + " says: ");
        penguin.walk();
        penguin.swim();

        Fish shark = new Shark("Eve the Shark", 7);
        Zoo.sharkAquarium.add(shark);
        System.out.println(shark.getName() + " was placed to aquarium");
        shark.feed();
        if (shark.isFed) {
            System.out.println(shark.getName() + " is fed now");
        }
        System.out.print(shark.getName() + " says: ");
        shark.swim();

        Sparrow sparrow = new Sparrow("Mini the Sparrow", 1);
        Zoo.birdsCage.add(sparrow);
        System.out.println(sparrow.getName() + " was placed to the birds cage");
        sparrow.feed();
        if (sparrow.isFed) {
            System.out.println(sparrow.getName() + " is fed now");
        }
        System.out.print(sparrow.getName() + " says: ");
        sparrow.fly();
        sparrow.walk();

        OtherAnimals tiger = new Tiger("Alice the Tiger", 10);
        Zoo.cage.add(tiger);
        System.out.println(tiger.getName() + " was placed to the ground cage");
        tiger.feed();
        if (tiger.isFed) {
            System.out.println(tiger.getName() + " is fed now");
        }
        System.out.print(tiger.getName() + " says: ");
        tiger.walk();
    }
}
