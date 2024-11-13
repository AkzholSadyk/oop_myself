package forTrainLab03.Task02;

public class Place {
    public String name;
    public String address;
    public Place(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj == null) return false;
        return obj.getClass() == this.getClass() && ((Place)obj).getName() == this.getName()
                && ((Place)obj).getAddress() == this.getAddress();
    }
}
