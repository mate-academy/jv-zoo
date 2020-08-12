package core.basesyntax.controller;

//https://github.com/mate-academy/jv-zoo/pull/24

import core.basesyntax.model.*;

import java.util.*;

import static core.basesyntax.controller.Solution.infoAboutAnimals;

public class Application {

    public static void main(String[] args) {

        System.out.println("Welcome to the Virtual Zoo:");
        List<? extends Animal> animalList = listAllAnimals();
        List<? extends Aves> avesList;
       // List<Pisces> piscesList = listAllAnimals();
        iterateAnimals(animalList);
        startMenu();

    }

    public static List<Animal> listAllAnimals() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Penguin("Skipper"));
        animals.add(new Penguin("Rico"));
        animals.add(new Penguin("Private"));
        animals.add(new Shark("Goblin"));
        animals.add(new Shark("Great White"));
        animals.add(new Shark("Mako"));
        animals.add(new Sparrow("Spock"));
        animals.add(new Sparrow("Mance"));
        animals.add(new Sparrow("Yashee"));
        animals.add(new Tiger("Amber"));
        animals.add(new Tiger("Cosimia"));
        animals.add(new Tiger("Cuddles"));
        return animals;
    }

    public static void findAnimalByName(List<? extends Animal> animals, String inputName) {
        animals.stream()
                .filter(animal -> animal.getName().equals(inputName))
                .findFirst()
                .orElseThrow();
    }

    public static void iterateAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println("My nam's " + animal.name + ".  " + animal.toString());
        }
    }
    public static void iterateAnimalsAves(List<? extends Aves> animals) {
        List<Animal> list = new ArrayList<>();
        for (Animal animal : animals) {
            list.add(animal);
            System.out.println("My nam's " + animal.name + ".  " + animal.toString());
        }
    }
    public static void iterateAnimalsPisces(List<? extends Pisces> animals) {
        for (Animal animal : animals) {
            System.out.println("My nam's " + animal.name + ".  " + animal.toString());
        }
    }

    public static Map<Integer, String> generatMenu() {
        Map<Integer, String> mapMenu = new HashMap<>();
        mapMenu.put(1, " What can these animals do?");
        mapMenu.put(2, " Who are 'Aves'(as Bird)");
        mapMenu.put(3, " Who are 'Pisces'(as Fish )");
        mapMenu.put(4, " Do you wont to feed the animal ?");
        mapMenu.put(5, " Exit");
        return mapMenu;
    }

    public static void startMenu() {
        Map<Integer, String> map = generatMenu();
        Scanner scan = new Scanner(System.in);
        boolean isExitChosen = false;
        while (!isExitChosen) {
            String chosenItem = " ";
            System.out.println("----------------------------------------------------");
            System.out.println("Choose any item:");
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + entry.getValue());
            }

            chosenItem = scan.nextLine();
            isExitChosen = processUserSelection(chosenItem);
        }
    }

    public static boolean processUserSelection(String chosenItem) {
        boolean isExitChosen = false;
        switch (chosenItem) {
            case "1":
                System.out.println("You chose: " + "What can these animals do?");
                infoAboutAnimals();
                break;
            case "2":
                System.out.println("You chose: " + "Who are 'Aves'(as Bird)");
//                List<Aves> animalList = iterateAnimalsAves();
//                iterateAnimalsAves(avesList);
                break;
            case "3":
                System.out.println("You chose: " + "Who are 'Pisces'(as Fish )");

                break;
            case "4":
                System.out.println("You chose: " + "I wont to feed the animal"
                        + "  input it name");
                List<Animal> animals = listAllAnimals();
                Scanner scanner = new Scanner(System.in);
                String s = scanner.nextLine();

                findAnimalByName(animals, s);
                System.out.println(s + " is eating now ..... ");

                break;
            case "5":
                System.out.println("You chose: Exit ");
                isExitChosen = true;
                break;
            default:
                System.out.println("Error");
                break;

        }

        return isExitChosen;
    }
}

