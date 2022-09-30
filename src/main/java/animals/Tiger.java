package animals;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Tiger " + getName() + " is eating fresh meat");
    }

    @Override
    public void whereDoILive() {
        System.out.println(getName() + " lives in aviary");
    }
}
