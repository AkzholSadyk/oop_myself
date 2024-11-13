package interface1.functional_interface;

import interface1.interface_segregation.Bird;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();

        Sounding bird = () -> System.out.println("Bird sound");
        bird.makeSound();
    }
}
