package interface1.basic;

public class Duck implements Flyable, Swimable {
    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }
    @Override
    public void fly() {
        System.out.println("Duck flying");
    }
}
