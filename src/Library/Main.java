package Library;


import Library.Model.Book;
import Library.Model.BookCopy;
import Library.Model.Librarian;
import Library.Model.Member;
import Library.Service.LibraryService;

public class Main {

    public static void main(String[] args) {

        Member member = new Member(1, "Arun", "9999999999");
        Librarian librarian =  new Librarian(1,"admin","1234");

        Book book = new Book("Clean Code");
librarian.addBook(book);
        BookCopy copy1 = new BookCopy(101);
        book.addCopy(copy1);

        LibraryService service = new LibraryService();

        service.borrowBook(member, copy1);
        librarian.displayBooks();
    }
}