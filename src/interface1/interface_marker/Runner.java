package interface1.interface_marker;

public class Runner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();

        if(bird instanceof Alive){
            System.out.println("I'm alive");
        }
        if(airplane instanceof Alive){
            System.out.println("I'm alive");
        }
        else{
            System.out.println("I'm not alive");
        }
    }
}
