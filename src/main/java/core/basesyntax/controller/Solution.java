package core.basesyntax.controller;

import core.basesyntax.AviaryForAllAnimals;
import core.basesyntax.AviaryForAnimalAsAves;
import core.basesyntax.AviaryForAnimalAsPisces;
import core.basesyntax.model.*;

public class Solution {
    public static void infoAboutAnimals() {
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

        //Penguin penguin = new Penguin("Skipper");
        //List<Animal> list = new ArrayList<>();
//        List<Animal> animalList = listAllAnimals();
//        for (Animal animal : animalList) {
//
//            AviaryForAllAnimals<? extends Aves> penguinAviary = new AviaryForAllAnimals<Penguin>(animal);
//            System.out.println("I'm penguin " + penguinAviary.getAnimal().name + " and");
//            penguinAviary.getAnimal().swim();
//            penguinAviary.getAnimal().fly();
//            penguinAviary.getAnimal().eat();
//            System.out.println("-----------------------------------------------------");
//        }

        Tiger tiger = new Tiger("Amber");
        AviaryForAllAnimals<Tiger> tigerAviary = new AviaryForAllAnimals<>(tiger);
        System.out.println("I'm tiger " + tigerAviary.getAnimal().name + " and");
        tigerAviary.getAnimal().eat();
        System.out.println("-----------------------------------------------------");
    }

}
