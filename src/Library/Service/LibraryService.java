package Library.Service;

import Library.Model.Member;
import Library.Model.*;

public class LibraryService {

    public void borrowBook(Member member, BookCopy copy) {

        if (!copy.isAvailable()) {
            System.out.println("Book not available");
            return;
        }

        Borrow borrow = new Borrow(member, copy);
        member.addBorrow(borrow);

        System.out.println("Book borrowed successfully");
    }
}