package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private AviaryForBirds aviaryForBirds = new AviaryForBirds();
    private Aviary aviary = new Aviary();
    private Aquarium aquarium = new Aquarium();

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.giveEatforEnimals();
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
