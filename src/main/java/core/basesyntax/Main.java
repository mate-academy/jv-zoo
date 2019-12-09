package core.basesyntax;

import java.util.ArrayList;

/**
 * Ваша задача заключается в том чтобы создать свой зоопарк, разместить животных по вольерам и накромить их.
 * Создание инстансов животных и кормление можно проводить в классе App(или Main или любом другом).
 * В данном темплейте есть класс HelloWorld и класс HelloWorldTest. Feel free to remove them)
 * <p>
 * Создать зоопарк
 * В зоопарке должны быть вольер для птиц, для всех животных и аквариум
 * Создать классы тигр, пингвин, воробей и акула и добавить в соответствующие среды обитания (см. п.2)
 * Птицы должны уметь летать, рыбы должны уметь плавать. Обратите внимание на пингвина, там не все так просто:
 * он может плавать, но не может летать, при єтом является птицей
 * Должна быть возможность накормить всех животных
 * Для решения задачи воспользоваться Дженериками
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> landAviary = new ArrayList<>();
        ArrayList<Animal> birdAviary = new ArrayList<>();
        ArrayList<Animal> aquarium = new ArrayList<>();

        Pinguin pinguin = new Pinguin("Pinguin");
        aquarium.add(pinguin);
        birdAviary.add(pinguin);
        System.out.println(pinguin.swimmable() + "\n"
                + pinguin.flyable() + "\n"
                + pinguin.feed() + "\n");

        Tiger tiger = new Tiger("Tiger");
        landAviary.add(tiger);
        System.out.println(tiger.runnable() + "\n"
                + tiger.feed() + "\n"
                + tiger.feed() + "\n");

        Sparrow sparrow = new Sparrow("Sparrow");
        birdAviary.add(sparrow);
        System.out.println(sparrow.flyable() + "\n"
                + sparrow.feed() + "\n"
                + sparrow.feed() + "\n");

        Shark shark = new Shark("Shark");
        aquarium.add(shark);
        System.out.println(shark.swimmable() + "\n"
                + shark.feed() + "\n"
                + shark.feed() + "\n");

        System.out.println("\nIn land aviarys live/s: ");
        for (Object obj : landAviary) {
            String temp = obj.getClass().toString();
            System.out.println("  -" + obj.getClass().getName()
                    .replace("core.basesyntax.", ""));
        }

        System.out.println("\nIn bird's aviarys live/s: ");
        for (Object obj : birdAviary) {
            String temp = obj.getClass().toString();
            System.out.println("  -" + obj.getClass().getName()
                    .replace("core.basesyntax.", ""));
        }

        System.out.println("\nIn aquariums live/s: ");
        for (Object obj : aquarium) {
            String temp = obj.getClass().toString();
            System.out.println("  -" + obj.getClass().getName()
                    .replace("core.basesyntax.", ""));
        }
    }
}

