package core.basesyntax;

public class App {
    public static void main(String[] args) {
        Zoo aquarium = new Aquarium();
        Zoo cageBird = new CageBird();
        Zoo cageAnimal = new CageAnimal();

        putAnimals(aquarium, cageBird, cageAnimal);

        aquarium.feed();
        cageBird.feed();
        cageAnimal.feed();
    }

    private static void putAnimals(Zoo aquarium, Zoo cageBird, Zoo cageAnimal) {
        for (Animals animal : Animals.values()) {
            switch (animal) {
                case SHARK:
                    aquarium.put(new Shark());
                    break;
                case PENGUIN:
                    cageBird.put(new Penguin());
                    break;
                case SPARROW:
                    cageBird.put(new Sparrow());
                    break;
                case TIGER:
                    cageAnimal.put(new Tiger());
                    break;
                default:
                    break;
            }
        }
    }
}
