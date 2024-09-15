import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();

    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }


    public void lendBook(String isbn, String memberId) {
        Book bookToLend = findBookByIsbn(isbn);
        Member memberToLendBook = findMemberById(memberId);

        if(bookToLend != null && memberToLendBook != null) {
            memberToLendBook.borrowBook(bookToLend);
        } else {
            System.out.println("Operation failed. Please try again.");
        }
    }

    private Book findBookByIsbn(String isbn) {
        for( Book  book : books ) {
            if( book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    private Member findMemberById(String memberId) {
        for( Member  member : members ) {
            if(Objects.equals(member.getMemberId(), memberId)) {
                return  member;
            }
        }
        return null;
    }
}
