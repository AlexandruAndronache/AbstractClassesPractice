public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog("Damian");
        dog.eat();
        dog.attack();
        dog.move();

        Bird penguin = new Penguin("Alex");
        penguin.fly();
    }
}
