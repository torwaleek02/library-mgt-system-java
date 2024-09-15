
import java.util.ArrayList;
import java.util.List;

public class Member {

    public String name;
    private String memberId;
    private List<Book> borrowedBooks = new ArrayList<>();


    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void borrowBook(Book book) {
        addBookToBorrowedList(book);
    }

    private void addBookToBorrowedList(Book book) {
        borrowedBooks.add(book);
    }

}
