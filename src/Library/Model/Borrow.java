package Library.Model;

import Library.Model.BookCopy;
import Library.Model.Member;

import java.time.LocalDate;

public class Borrow {

    private Member member;
    private BookCopy copy;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public Borrow(Member member, BookCopy copy) {
        this.member = member;
        this.copy = copy;
        this.issueDate = LocalDate.now();
        copy.setAvailable(false);
    }

    public void returnBook() {
        this.returnDate = LocalDate.now();
        copy.setAvailable(true);
    }
}