package core.basesyntax.controller;

import core.basesyntax.AviaryForAllAnimals;
import core.basesyntax.AviaryForAnimalAsAves;
import core.basesyntax.AviaryForAnimalAsPisces;

public class Solution {
    public void addAnimalToZoo() {
        Sparrow sparrow = new Sparrow("Skipper");
        AviaryForAnimalAsAves<Sparrow> sparrowAviary = new AviaryForAnimalAsAves<>(sparrow);
        System.out.println("I'm sparrow " + sparrowAviary.getAves().name + " and ");
        sparrowAviary.getAves().fly();
        sparrowAviary.getAves().eat();
        System.out.println("-----------------------------------------------------");

        Shark shark = new Shark("Skipper");
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

        Tiger tiger = new Tiger("Skiper");
        AviaryForAllAnimals<Tiger> tigerAviary = new AviaryForAllAnimals<>(tiger);
        System.out.println("I'm tiger " + tigerAviary.getAnimal().name + " and");
        tigerAviary.getAnimal().eat();
        System.out.println("-----------------------------------------------------");
    }
}
