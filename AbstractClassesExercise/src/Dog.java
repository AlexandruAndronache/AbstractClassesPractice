public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    protected void move() {
        System.out.println(getName() + " is moving");
    }

    @Override
    protected void attack() {
        System.out.println(getName() + " cannot attack");
    }
}
