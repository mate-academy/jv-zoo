package core.basesyntax.myzoo;

public abstract class Animal {
    public void feed() {
        System.out.print(getClass().toString().substring(28) + " is eating!\n");
    }
}
