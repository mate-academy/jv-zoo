package core.basesyntax;

import core.basesyntax.animal.Animal;
import core.basesyntax.animal.Tiger;
import core.basesyntax.aviaries.AnimalsAviary;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Animal t = new Tiger("fdd",5,false);
        AnimalsAviary<Animal> a1 = new AnimalsAviary<>();
        a1.addToAnimalAviary(t);
    }
}
