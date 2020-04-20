package core.basesyntax;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        Shark sharkMary = new Shark("Mary", "cabbage");
        Shark sharkSilvia = new Shark("Silvia", "grapes");
        Sparrow sparrowJack = new Sparrow("Jack", "french fries");
        Penguin penguinLeo = new Penguin("Leo", "chocolate");
        Tiger tigerMichael = new Tiger("Michael", "lobsters");
        Penguin penguinSusy = new Penguin("Susy", "snow");

        Stream.of(sharkMary, sharkSilvia, sparrowJack, penguinLeo, tigerMichael, penguinSusy)
                .forEach(x -> myZoo.put(x, false));

        sharkSilvia.setFavouriteFood("carrots");
        tigerMichael.setWeight(182);
        penguinLeo.swim();
        sparrowJack.fly();
        System.out.println("Susy just laid " + penguinSusy.getNumberOfEggsLaying() + " egg.");

        myZoo.moveToCommonEnclosure(sparrowJack);
        myZoo.getAllAnimalsFromEnclosure(Zoo.Enclosure.COMMON_ENCLOSURE)
                .forEach(System.out::println);

        myZoo.moveToSpecialEnclosureIfPossible(tigerMichael); // not possible ;)

        myZoo.setFree(sparrowJack);
        myZoo.getAllAnimalsFromEnclosure(Zoo.Enclosure.COMMON_ENCLOSURE)
                .forEach(System.out::println);

        myZoo.getAllAnimalsFromEnclosure(Zoo.Enclosure.AQUARIUM)
                .stream()
                .map(x -> (CanSwim) x)
                .forEach(CanSwim::swim);

        myZoo.getAllAnimals()
                .forEach(Animal::feed);
    }
}