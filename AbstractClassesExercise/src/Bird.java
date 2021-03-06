public abstract class Bird extends Animal {
    public Bird(String name) {
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

    protected abstract void fly();


}
