package Library.Model;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<BookCopy> bookCopyList = new ArrayList<>() ;

    public Book(String title) {
        this.title = title;

    }
    public void addCopy(BookCopy bc)
    {
        bookCopyList.add(bc);
    }
    public List<BookCopy> getBookCopyList()
    {
        return bookCopyList;
    }

    public String getTitle() {
        return title;
    }


}
