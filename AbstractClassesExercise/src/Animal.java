public abstract class Animal  {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

     public abstract void eat();
    protected abstract void move();

    protected void attack() {
        System.out.println(this.name + " is attacking");
    }

    public String getName() {
        return name;
    }
}
