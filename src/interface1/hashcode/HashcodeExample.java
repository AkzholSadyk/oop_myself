package interface1.hashcode;




public class HashcodeExample {
    public static void main(String[] args) {
        Child child1 = new Child("Sadyk Akzhol", 2019);
        Child child2 = new Child("Kenshe Yerassyl", 2019);
        Child child3 = new Child("Balkasym Samat", 2020);
        Child child4 = new Child("Kuatbay Ersultan", 2020);



        Child[] group0 = {child3, child2};
        Child[] group1 = {child1, child4};

        Child[][] children = {group0, group1};

        ChildrenGardenWithGroups childrenGarden = new ChildrenGardenWithGroups(children);


        Child forfind =  new Child("Kenshe Yerassyl", 2019);

        boolean result = false;

        for(Child child : childrenGarden.getChildren()[forfind.hashCode()]){
            if(child.equals(forfind)){
                result = true;
                break;
            }
        }

//        for (Child[] group : childrenGarden.getChildren()){
//            for (Child child : group){
//                child.equals(forfind);
//            }
//        }

        System.out.println(result);

    }
}
