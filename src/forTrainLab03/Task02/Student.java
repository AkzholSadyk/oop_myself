package forTrainLab03.Task02;

public class Student extends Person {
    String uni;
    public Student(String name, int age, int cash, String uni, Place placeOfWork) {
        super(name, age, cash, placeOfWork);
        this.uni = uni;
    }

    public String getUni() {
        return uni;
    }
    public void setUni(String uni) {
        this.uni = uni;
    }

    @Override
    public void eat(){
        System.out.println("student is eating");
    }
}
