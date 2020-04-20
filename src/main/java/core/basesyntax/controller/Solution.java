package core.basesyntax.controller;

import core.basesyntax.AviaryForAllAnimals;
import core.basesyntax.AviaryForAnimalAsAves;
import core.basesyntax.AviaryForAnimalAsPisces;
import core.basesyntax.model.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Solution {
    public void addAnimalToZoo() {
        List<Penguin> penguinList = new ArrayList<>();
        penguinList.add(new Penguin("Skipper"));
        penguinList.add(new Penguin("Rico"));
        penguinList.add(new Penguin("Private"));

        List<Shark> sharkList = new ArrayList<>();
        sharkList.add(new Shark("GOBLIN"));
        sharkList.add(new Shark("GREAT WHITE"));
        sharkList.add(new Shark("MAKO"));

        Sparrow sparrow = new Sparrow("MAKO");
        AviaryForAnimalAsAves<Sparrow> sparrowAviary = new AviaryForAnimalAsAves<>(sparrow);
        System.out.println("I'm sparrow " + sparrowAviary.getAves().name + " and ");
        sparrowAviary.getAves().fly();
        sparrowAviary.getAves().eat();
        System.out.println("-----------------------------------------------------");

        Shark shark = new Shark("GOBLIN");
        AviaryForAnimalAsPisces<Shark> sharkAviary = new AviaryForAnimalAsPisces<>(shark);
        System.out.println("I'm shark " + sharkAviary.getPisces().name + " and ");
        sharkAviary.getPisces().eat();
        sharkAviary.getPisces().swim();
        System.out.println("-----------------------------------------------------");

        Penguin penguin = new Penguin("Skipper");
        AviaryForAllAnimals<Penguin> penguinAviary = new AviaryForAllAnimals<>(penguin);
        System.out.println("I'm penguin " + penguinAviary.getAnimal().name + " and");
        penguinAviary.getAnimal().swim();
        penguinAviary.getAnimal().fly();
        penguinAviary.getAnimal().eat();
        System.out.println("-----------------------------------------------------");

        Tiger tiger = new Tiger("Amber");
        AviaryForAllAnimals<Tiger> tigerAviary = new AviaryForAllAnimals<>(tiger);
        System.out.println("I'm tiger " + tigerAviary.getAnimal().name + " and");
        tigerAviary.getAnimal().eat();
        System.out.println("-----------------------------------------------------");
    }

    public static void iterateAnimals(Collection<? extends Animal> animals) {

        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
    }
}
