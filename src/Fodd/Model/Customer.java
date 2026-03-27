package Fodd.Model;

public class Customer extends User {
    private  String location;

    public Customer(int userId,String name,String email,String password,String location)
    {
        super(userId,name,email,password);
        this.location =  location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
