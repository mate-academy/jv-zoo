package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Shark shark = new Shark("Акула", 90);
        Penguin penguin = new Penguin("Пингвин", 8);
        Sparrow sparrow = new Sparrow("Воробей", 3);
        Tiger tiger = new Tiger("Тигр", 25);

        zoo.addAnimal(shark);
        zoo.addAnimal(sparrow);
        zoo.addAnimal(tiger);
        zoo.addAnimal(penguin);


        System.out.println(zoo);
//        System.out.println(shark);
//
//        AnimalsHome<> tigerAnimalsHome = new CatsHome<Tiger>();
//        CatsHome<? extends Cat> tigerCatsHome1 = new CatsHome<Tiger>();
//
//        tigerAnimalsHome.setCat(tiger);
//
//        tiger.eat();
//        System.out.println(tigerAnimalsHome);



    }
}
