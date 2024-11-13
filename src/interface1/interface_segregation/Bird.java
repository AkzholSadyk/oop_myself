package interface1.interface_segregation;

public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bird flying");
    }
}
