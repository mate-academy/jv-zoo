package core.basesyntax;

import core.basesyntax.models.animals.*;
import core.basesyntax.models.aviars.AnimalsAviary;
import core.basesyntax.models.aviars.Aquarium;
import core.basesyntax.models.aviars.BirdsAviary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BirdsAviary birdsAviary = new BirdsAviary(getBirds());
        Aquarium aquarium = new Aquarium(getFishes());
        AnimalsAviary animalsAviary = new AnimalsAviary(getAnimals());
        Zoo zoo = new Zoo(animalsAviary, aquarium, birdsAviary);

        zoo.feedAllAnimals();

        //zoo.getAquarium().getFishes().stream().forEach(f -> f.swim());
    }

    private static List<Animal> getAnimals() {
        List <Animal> list = new ArrayList<>();
        Tiger tiger = new Tiger("Lex", 2);
        Tiger tiger2 = new Tiger("Robby", 3);
        list.add(tiger);
        list.add(tiger2);
        return list;
    }

    private static List<Animal> getFishes() {
        List <Animal> list = new ArrayList<>();
        Shark shark = new Shark("Linda", 5);
        Shark shark2 = new Shark("Joe", 7);
        list.add(shark);
        list.add(shark2);
        return list;
    }

    private static List<Animal> getBirds(){
        List <Animal> list = new ArrayList<>();
        Sparrow sparrow = new Sparrow("Jack", 1);
        Sparrow sparrow2 = new Sparrow("Jane", 1);
        Penguin penguin = new Penguin("Christopher", 8);
        Penguin penguin2 = new Penguin("Margarita", 4);
        list.add(sparrow);
        list.add(sparrow2);
        list.add(penguin);
        list.add(penguin2);
        return list;
    }

}
