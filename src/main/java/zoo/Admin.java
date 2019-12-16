package zoo;

import java.util.ArrayList;
import java.util.List;

public class Admin {

    public static void main(String[] args) {

        Bird pinguin = new Pinguin();
        Bird sparrow = new Sparrow();
        List<Bird> cages = new ArrayList<>();
        cages.add(pinguin);
        cages.add(sparrow);

        Mammal tiger = new Tiger();
        List<Mammal> walliers = new ArrayList<>();
        walliers.add(tiger);

        Fish shark = new Shark();
        List<Fish> aquariums = new ArrayList<>();
        aquariums.add(shark);

        List<Animal> zoo = new ArrayList<>();
        zoo.addAll(aquariums);
        zoo.addAll(cages);
        zoo.addAll(walliers);

        for (Animal x : zoo) {
            x.feed();
        }
    }
}
