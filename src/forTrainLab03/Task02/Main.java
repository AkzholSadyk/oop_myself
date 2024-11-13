package forTrainLab03.Task02;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurantDodo = new Restaurant("dodo", "Tole bi 130");
        Vector<CanHavePizza> somethgEater = new Vector<>();
        somethgEater.add(new Student("daryn", 18, 5000, "KBTU", restaurantDodo));
        somethgEater.add(new Person("terrere", 25, 100000));
        somethgEater.add(new Cat("vasya"));

        for(CanHavePizza eater : somethgEater) {
            restaurantDodo.service(eater);
        }
    }
}
