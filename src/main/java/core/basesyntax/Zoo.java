package core.basesyntax;

public class Zoo {

    private Aviary<Swimmable> aquarium;
    private Aviary<Runnable> forMammals;
    private Aviary<Flyable> forBirds;

    public Zoo() {
        aquarium = new Aviary<>("swimming");
        forMammals = new Aviary<>("walking and running");
        forBirds = new Aviary<>("flying");
    }

    public void settleAnimals(Animal[] newAnimals) {
        for (Animal animal : newAnimals) {
            if (animal instanceof Swimmable) {
                aquarium.addAnimal((Swimmable) animal);
            } else if (animal instanceof Flyable) {
                forBirds.addAnimal((Flyable) animal);
            } else {
                forMammals.addAnimal((Runnable) animal);
            }
        }
        System.out.println(String.format("The aviary for swimming was filled with %d animals",
                aquarium.aviaryFullness()));
        System.out.println(String.format(
                "The aviary for walking and running was filled with %d animals",
                forMammals.aviaryFullness()));
        System.out.println(String.format("The aviary for flying was filled with %d animals\n",
                forBirds.aviaryFullness()));
    }

    public Aviary<Runnable> getJungleAviary() {
        return forMammals;
    }

    public Aviary<Swimmable> getAquaAviary() {
        return aquarium;
    }

    public Aviary<Flyable> getFlyingAviary() {
        return forBirds;
    }

    public void deliverFood() {
        aquarium.feedAnimals();
        forMammals.feedAnimals();
        forBirds.feedAnimals();
    }
}
