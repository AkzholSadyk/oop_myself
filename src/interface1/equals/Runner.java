package interface1.equals;

public class Runner {
    public static void main(String[] args) {
        Child child1 = new Child("Sadyk Akzhol", 2019);
        Child child2 = new Child("Kenshe Yerassyl", 2023);
        Child child3 = new Child("Balkasym Samat", 2020);
        Child child4 = new Child("Kuatbay Ersultan", 2021);

        Child[] children = {child1, child2, child3, child4};
        ChildrenGarden garden = new ChildrenGarden(children);

        boolean result = false;

        Child childforfind = new Child("Sadyk Akzhol", 2019);

        for(Child child : garden.getChildren()){
            if(child.getName().equals(childforfind.getName())){
                result = true;
                break;
            }
//            if(child.getName().equals("Sadyk Akzhol")&&child.getYear() == 2019){
//                result = true;
//                break;
//            }
        }
        System.out.println(result);
    }
}
