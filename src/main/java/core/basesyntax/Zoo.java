package core.basesyntax;

public class Zoo {
    public static void main(String[] args) {
        Location[] zoo = new Location[] { new Location(Location.Locations.AQUARIUM),
                new Location(Location.Locations.BIRDSAVIARY),
                new Location(Location.Locations.GENERALSAVIARY),
                new Location(Location.Locations.MAMMALSAVIARY) };
        for (Location loc : zoo) {
            System.out.println("Вхожу в " + loc.getLocation().toString());
            loc.feederComing();
            System.out.println("Кормлю животных в этом вольере...");
            loc.feed();
        }
    }
}
