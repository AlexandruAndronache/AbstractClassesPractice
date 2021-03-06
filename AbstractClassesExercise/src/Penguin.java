public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    protected void fly() {
        System.out.println(getName() + " is a penguin, can't fly");
    }
}
