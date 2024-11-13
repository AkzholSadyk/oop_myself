package interface1.clone;

public class Agent {
    private String name;

    public Agent(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
