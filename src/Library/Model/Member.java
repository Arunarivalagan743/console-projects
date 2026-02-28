package Library.Model;

import java.util.ArrayList;

public class Member extends User{
    ArrayList <Borrow> borrowArrayList = new ArrayList<>() ;
    public Member(int userId, String name, String phone) {
        super(userId, name, phone);
        this.borrowArrayList = borrowArrayList;
    }
    public void addBorrow(Borrow b)
    {
        borrowArrayList.add(b);
    }


}
