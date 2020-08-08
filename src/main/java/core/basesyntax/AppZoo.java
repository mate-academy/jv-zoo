package core.basesyntax;

public class AppZoo {
    public static void main(String[] args) {
        java.util.List<ZooAnimals> zoo = new java.util.ArrayList<>();

        ZooAnimals tigerDan = new Tiger("Tiger Dan");
        tigerDan.addToZoo(tigerDan, zoo);

        ZooAnimals sparrowFast = new Sparrow("Sparrow Fast");
        sparrowFast.addToZoo(sparrowFast, zoo);

        ZooAnimals sharkWhite = new Shark("Shark White");
        sharkWhite.addToZoo(sharkWhite, zoo);

        ZooAnimals penguinBlue = new Penguin("Penguin Blue");
        penguinBlue.addToZoo(penguinBlue, zoo);

        for (int i = 0; i < zoo.size(); i++) {
            zoo.get(i).toFeed();
        }

        for (ZooAnimals animal : zoo) {
            switch (animal.aviary) {
                case LAND:
                    System.out.println(animal.name + " lives on land");
                    break;
                case AIR:
                    System.out.println(animal.name + " lives on air aviary");
                    break;
                case WATER:
                    System.out.println(animal.name + " lives in water");
                    break;
                default:
                    break;
            }
        }
    }
}
