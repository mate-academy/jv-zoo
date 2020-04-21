package core.basesyntax.controller;

import core.basesyntax.model.Animal;
import core.basesyntax.model.Aves;
import core.basesyntax.model.Penguin;
import core.basesyntax.model.Pisces;
import core.basesyntax.model.Shark;
import core.basesyntax.model.Sparrow;
import core.basesyntax.model.Tiger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static core.basesyntax.controller.Solution.infoAboutAnimals;

public class Application {

    public static void main(String[] args) {

        System.out.println("Welcome to the Virtual Zoo:");
        List<Animal> animalList = listAllAnimals();
        iterateAnimals(animalList);
        List<? extends Aves> listAves;
        //iterateAnimalsAves();
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

    public void addPenguin() {
        List<Penguin> penguinList = new ArrayList<>();
        penguinList.add(new Penguin("Skipper"));
        penguinList.add(new Penguin("Rico"));
        penguinList.add(new Penguin("Private"));
    }

    public void addShark() {
        List<Shark> sharkList = new ArrayList<>();
        sharkList.add(new Shark("Goblin"));
        sharkList.add(new Shark("Great White"));
        sharkList.add(new Shark("Mako"));

    }

    public void addSparrow() {
        List<Sparrow> sparrowList = new ArrayList<>();
        sparrowList.add(new Sparrow("Spock"));
        sparrowList.add(new Sparrow("Mance"));
        sparrowList.add(new Sparrow("Yashee"));
    }

    public void addTiger() {
        List<Tiger> tigerList = new ArrayList<>();
        tigerList.add(new Tiger("Amber"));
        tigerList.add(new Tiger("Cosimia"));
        tigerList.add(new Tiger("Cuddles"));
    }

    public static void findAnimalByName(List<? extends Animal> animals, String inputName) {
        animals.stream()
                .filter(animal -> animal.getName().equals(inputName))
                .findFirst()
                .orElseThrow();
    }

    public static void iterateAnimals(Collection<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println("My nam's " + animal.name + ".  " + animal.toString());
        }
    }

    public static void iterateAnimalsAves(Collection<? extends Aves> animals) {
        for (Aves animal : animals) {
            System.out.println("My nam's " + animal.name + ".  " + animal.toString());
        }
    }

    public static void iterateAnimalsPisces(Collection<? extends Pisces> animals) {
        for (Pisces animal : animals) {
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
                //iterateAnimalsAves();

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

