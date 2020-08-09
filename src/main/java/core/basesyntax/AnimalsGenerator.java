package core.basesyntax;

import java.util.Random;

public class AnimalsGenerator {
    public Animal[] fillRandomly(int n) {
        Animal[] randomAnimals = new Animal[n];
        Animal newAnimal = null;
        Random randomizer = new Random();
        Name[] names = Name.values();
        for (int i = 0; i < n; i++) {
            int randomNumber = randomizer.nextInt(4);
            int randomName = randomizer.nextInt(names.length);
            int randomAge = randomizer.nextInt(10);
            switch (randomNumber) {
                case 0:
                    newAnimal = new Shark(names[randomName], randomAge);
                    break;
                case 1:
                    newAnimal = new Tiger(names[randomName], randomAge);
                    break;
                case 2:
                    newAnimal = new Penguin(names[randomName], randomAge);
                    break;
                case 3:
                    newAnimal = new Sparrow(names[randomName], randomAge);
                    break;
                default:
                    System.out.println("Animals without appropriate interface are not allowed ");
            }
            randomAnimals[i] = newAnimal;
        }
        return randomAnimals;
    }
}
