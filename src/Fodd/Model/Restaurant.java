package Fodd.Model;

import java.util.List;

public class Restaurant extends User{
       private  String fssai;
       private  List<FoodItem> items;

    public Restaurant(int userId, String name, String email, String password, String fssai,List <FoodItem> items) {
        super(userId, name, email, password);
        this.fssai = fssai;
        this.items =  items;
    }

    public List<FoodItem> getItems() {
        return items;
    }

    public void setItems(List<FoodItem> items) {
        this.items = items;
    }

    public String getFssai() {
        return fssai;
    }
}
