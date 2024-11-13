package forTrainLab03.Task02;

public class Restaurant extends Place{
    double pizzaPrice;
    public Restaurant(String name, String address) {
        super(name, address);
    }

    boolean service(CanHavePizza eater){
        if(eater instanceof Person person){
            if(this.equals(person.getPlaceOfWork())){
                System.out.println("people eat for free");
            }
            if(eater.getClass() == Student.class){
                double cashOfPerson = ((Student)eater).getCash();
                ((Student) eater).setCash(cashOfPerson - (pizzaPrice * 0.9));
                System.out.println("student eat with discount");
            }
            else{

                double cashOfPerson = ((Person)eater).getCash();
                ((Person) eater).setCash(cashOfPerson - pizzaPrice);
                System.out.println("Person eat Pizza");
            }
        }
        else if (eater instanceof Cat){
            System.out.println("cat eat for free");
        }
        eater.eat();
        return true;
    }
}