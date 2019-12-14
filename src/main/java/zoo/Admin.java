package zoo;

import java.util.ArrayList;
import java.util.List;

public class Admin {

    public static void main(String[] args) {

        Birds pinguin = new Pinguin();
        Birds sparrow = new Sparrow();
        List<Birds> cages = new ArrayList<>();
        cages.add(pinguin);
        cages.add(sparrow);

        Mummals tiger = new Tiger();
        List<Mummals> walliers = new ArrayList<>();
        walliers.add(tiger);

        Fishes shark = new Shark();
        List<Fishes> aquariums = new ArrayList<>();
        aquariums.add(shark);

        List<Animals> zoo = new ArrayList<>();
        zoo.addAll(aquariums);
        zoo.addAll(cages);
        zoo.addAll(walliers);

        for (Animals x : zoo) {
            x.feed();
        }
    }
}
