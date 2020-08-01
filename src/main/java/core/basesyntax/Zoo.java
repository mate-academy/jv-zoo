package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private AviaryForBirds aviaryForBirds;
    private Aviary aviary;
    private Aquarium aquarium;

    public Zoo() {

        Shark shark = new Shark();
        Sparrow sparrow = new Sparrow();
        Penguin pengiun = new Penguin();
        Tiger tiger = new Tiger();

        this.aviaryForBirds = new AviaryForBirds(sparrow);
        this.aviary = new Aviary(tiger, pengiun);
        this.aquarium = new Aquarium(shark);
    }

    public void giveEatforEnimals() {

        List list = new ArrayList();
        list.add(this.aquarium.getShark());
        list.add(this.aviary.getPenguin());
        list.add(this.aviary.getTiger());
        list.add(this.aviaryForBirds.getSparrow());

        for (Object animal : list) {
            Animal someAnimal = (Animal) animal;
            someAnimal.eat();
        }
    }
}
