import animals.*;
import areas.Aviary;
import areas.BirdAviary;
import areas.Oceanarium;
import interfaces.Flyable;
import interfaces.Swimmable;
import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Tiger("Аркадий"));
        zoo.add(new Penguin("Валерчик"));
        zoo.add(new Sparrow("Джек"));
        zoo.add(new Shark("Геннадий"));

        for (Animal animal : zoo) {
            animal.doEat();
        }

        for (Animal animal : zoo) {
            if (animal instanceof Aviary) {
                ((Aviary) animal).doILiveInAviary();
            }
            if (animal instanceof BirdAviary) {
                ((BirdAviary) animal).doILiveInBirdAviary();
            }
            if (animal instanceof Oceanarium) {
                ((Oceanarium) animal).doILiveInOceanarium();
            }
        }
        for (Animal animal : zoo) {
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).doSwim();
            }
            if (animal instanceof Flyable) {
                ((Flyable) animal).doFly();
            }
        }
    }

}

