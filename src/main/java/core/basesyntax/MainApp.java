package core.basesyntax;


public class MainApp {
    private final static String LINE = "------------------------------------------";

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Shark shark = new Shark("Shark", 90);
        Penguin penguin = new Penguin("Penguin", 8);
        Sparrow sparrow = new Sparrow("Sparrow", 3);
        Tiger tiger = new Tiger("Tiger", 25);

        zoo.addAnimal(shark);
        zoo.addAnimal(sparrow);
        zoo.addAnimal(tiger);
        zoo.addAnimal(penguin);

        System.out.println(LINE +
                "\nWho are living in zoo\n" +
                LINE);
        System.out.println(zoo);

        System.out.println(LINE +
                "\nWe are feeding animals\n" +
                LINE);
        zoo.feedAllAnimal();

        System.out.println(LINE +
                "\nTrying to feed animal who is present in zoo\n" +
                LINE);
        zoo.feedAnimalByName("Sparrow", "Semki from Homka");

        System.out.println(LINE +
                "\nTrying to feed animal who is absent in zoo\n" +
                LINE);
        zoo.feedAnimalByName("Lion", "Meal");

//        zoo.birdsHome.animalHashMap.entrySet().stream()
//                .;
//                        filter(p -> penguin.swim())

    }
}
