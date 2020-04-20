package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.feed();

        int gawno = (int) (Math.random() * 100 + 1),
                flyable = (int) (Math.random() * 100 + 1),
                swimmable = (int) (Math.random() * 100 + 1),
                penguins = (int) (Math.random() * 100 + 1),
                Mammals = (int) (Math.random() * 100 + 1);
        ArrayList<Object> mycorka = new ArrayList<>();
        for (int i = 0; i < gawno; i++) {
            mycorka.add(new Object());
        }
        for (int i = 0; i < penguins; i++) {
            mycorka.add(new Penguin());
        }
        for (int i = 0; i < flyable; i++) {
            mycorka.add(new Sparrow());
        }
        for (int i = 0; i < swimmable; i++) {
            mycorka.add(new Shark());
        }
        for (int i = 0; i < Mammals; i++) {
            mycorka.add(new Tiger());
        }
        List<? super Flyable> birdsAviaryBox = mycorka.stream()
                .filter(animal -> animal instanceof Flyable).collect(Collectors.toList());
        List<? super Swimmable> aquariumBox = mycorka.stream()
                .filter(animal -> animal instanceof Swimmable).collect(Collectors.toList());
        List<? super Mammals> animalsAviaryBox = mycorka.stream()
                .filter(animal -> animal instanceof Mammals).collect(Collectors.toList());
        System.out.println(birdsAviaryBox.get(0));
    }
}
