package forTrainLab03.Task02;

public class Person implements CanHavePizza, Comparable<Person>, Eat {
    private String name;
    private int age;
    private double cash;
    private Place placeOfWork;

    public Person(String name, int age, double cash) {
        this.name = name;
        this.age = age;
        this.cash = cash;
    }
    public Person(String name, int age, double cash, Place placeOfWork) {
        this(name , age, cash);
        this.placeOfWork = placeOfWork;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getCash() {
        return cash;
    }
    public void setCash(double cash) {
        this.cash = cash;
    }
    public Place getPlaceOfWork() {
        return placeOfWork;
    }
    public void setPlaceOfWork(Place placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    @Override
    public void eat() {
        System.out.println(name + "is eating pizza");
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Compare by age
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
