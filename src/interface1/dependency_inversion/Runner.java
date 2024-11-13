package interface1.dependency_inversion;

public class Runner {
    public static void main(String[] args) {
        Poodle poodle = new Poodle();
        Shepherd shepherd = new Shepherd();
        Terier terier = new Terier();
        DogOWner owner = new DogOWner(terier, shepherd);
        DogOWner owner2 = new DogOWner(poodle, shepherd);
    }
}
