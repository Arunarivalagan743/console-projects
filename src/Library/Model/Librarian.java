package Library.Model;

import Library.Interface.LibrarianImple;

import java.util.ArrayList;

public class Librarian extends User implements LibrarianImple {
    ArrayList <Book> bookArrayList = new ArrayList();
    public Librarian(int userId, String name, String phone) {
        super(userId, name, phone);
    }

    @Override
    public void addBook(Book b) {
        bookArrayList.add(b);
    }
    public void displayBooks()
    {
        for (Book b : bookArrayList)
        {
            System.out.println(b.getTitle());
        }
    }
}
