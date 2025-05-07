import animals.Animal;
import animals.Penguin;
import animals.Shark;
import animals.Sparrow;
import animals.Tiger;
import interfaces.Flyable;
import interfaces.Swimmable;
import java.util.ArrayList;

public class Zoo {
    public void createZoo() {
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Tiger("Arcadiy"));
        zoo.add(new Penguin("Valerio"));
        zoo.add(new Sparrow("Jack"));
        zoo.add(new Shark("Gennadiy"));

        for (Animal animal : zoo) {
            animal.eat();
            animal.whereDoILive();
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).doSwim();
            }
            if (animal instanceof Flyable) {
                ((Flyable) animal).doFly();
            }
        }

    }

}

