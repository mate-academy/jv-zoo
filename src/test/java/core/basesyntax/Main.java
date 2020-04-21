package core.basesyntax;

import core.basesyntax.animals.birds.Penguin;


public class Main {
    public static void main(String[] args) {
        ZooPark zoo = new ZooPark();
        zoo.feedAll();

        Penguin penguin = new Penguin();
        penguin.swim();


    }

}