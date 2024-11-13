package interface1.dependency_inversion;

public class DogOWner {
    private Dog dog1;
    private Dog dog2;

    public DogOWner(Dog dog1, Dog dog2) {
        System.out.println("doesnt matter");
        this.dog1 = dog1;
        this.dog2 = dog2;
    }
    public DogOWner(Poodle poodle, Shepherd shepherd) {
        System.out.println("Only poodle and shepherd");
        this.dog1 = poodle;
        this.dog2 = shepherd;
    }

}
