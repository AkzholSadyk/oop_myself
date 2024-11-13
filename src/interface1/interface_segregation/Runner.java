package interface1.interface_segregation;

public class Runner {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Bird bird = new Bird();
        airplane.drive();
        airplane.fly();
        bird.fly();

    }
}
