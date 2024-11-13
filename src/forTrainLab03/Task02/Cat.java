package forTrainLab03.Task02;

public class Cat implements CanHavePizza, Eat {
    String name;
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating pizza");
    }
}
