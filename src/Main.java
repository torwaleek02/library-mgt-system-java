public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Library Management System");
        Book book = new Book("Advanced Java", "Tor the Pro", "123456", 4 );
        System.out.println("Book isbn: " + book.getIsbn());

        Member member = new Member("samson", "1");
        System.out.println("Memeber Id: " + member.getMemberId());
        member.borrowBook(book);

        Library library = new Library();
        library.addBook(book);
        library.registerMember(member);
        library.lendBook("123456", "1");

    }
}
