package Zoo;

import java.util.*;

public class Admin {

    public static void main(String[] args) {

        Birds pinguin = new Pinguin();
        Birds sparrow = new Sparrow();
        Mummals tiger = new Tiger();
        Fishes shark = new Shark();

        List<Fishes> aquariums = new ArrayList<>();
        List<Birds> cages = new ArrayList<>();
        List<Mummals> walliers = new ArrayList<>();

        aquariums.add(shark);
        cages.add(pinguin);
        cages.add(sparrow);
        walliers.add(tiger);

        List<Animals> zoo = new ArrayList<>();
        zoo.addAll(aquariums);
        zoo.addAll(cages);
        zoo.addAll(walliers);


        for (Animals x : zoo) {
            x.feed();
        }
    }
}
