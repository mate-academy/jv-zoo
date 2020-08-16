package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Lion lion = new Lion();
        Shark shark = new Shark();
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        Zoo myZoo = new Zoo();
        myZoo.setAnimalInZoo(lion);
        myZoo.setAnimalInZoo(shark);
        myZoo.setAnimalInZoo(sparrow);
        myZoo.setAnimalInZoo(penguin);

        AviaryForAnimals aviaryForAnimals = new AviaryForAnimals();
        aviaryForAnimals.putInAviary(lion);
        for (Landy animal : aviaryForAnimals.getAnimals()) {
            animal.goForAWalk();
        }

        Aquarium aquarium = new Aquarium();
        aquarium.putInAviary(shark);
        aquarium.putInAviary(penguin);
        for (Swimmable animal : aquarium.getAnimals()) {
            animal.swim();
        }

        CageForBirds cageForBirds = new CageForBirds();
        cageForBirds.putInAviary(sparrow);
        for (Flyable animal : cageForBirds.getAnimals()) {
            animal.fly();
        }

        myZoo.feedAnimals(myZoo.getAnimalsInZoo());
    }
}
