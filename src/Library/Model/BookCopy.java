package Library.Model;

public class BookCopy {

    private int copyId;
    private boolean isAvailable = true;

    public BookCopy(int copyId) {
        this.copyId = copyId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getCopyId() {
        return copyId;
    }
}