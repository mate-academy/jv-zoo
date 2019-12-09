package core.basesyntax.animal;

/**
 * Feel free to remove this class and create your own.
 */
public abstract class Animal {
    public String name;

    public Animal(String name){
        this.name = name;
    }

    public void feed() {
        System.out.println("I've been feeded, Thanks");
    }
}
