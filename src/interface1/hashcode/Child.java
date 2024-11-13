package interface1.hashcode;

public class Child {
    private String name;

    private int year;

    public Child(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public int getYear(){
        return year;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(obj instanceof interface1.equals.Child child2){
            return this.getName().equals(child2.getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getYear() %2;
    }

}
