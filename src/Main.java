import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



// Main class
public class Main {
    public static void main(String[] args) {

        // Creating library, members and books
        Library library = new Library();
        Member member1 = new Member("M001", "Edouard");
        Member member2 = new Member("M002", "Chantal");

        Book book1 = new Book("123", "Java Programming", "Teacher", 2020);
        Book book2 = new Book("456", "Python Programming", "Sibomana", 2019);
        Book book3 = new Book("789", "C++ Programming", "Praise", 2018);
        Book book4 = new Book("785", "Advance Springboot", "Eric", 2024);

        // Adding books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Displaying available books
        library.displayAvailableBooks();

        // Borrowing books
        library.borrowBook("123", member1);
        library.borrowBook("456", member2);

        // Displaying available books after borrowing
        library.displayAvailableBooks();

        // Displaying borrowed books for each member
        member1.displayBorrowedBooks();
        member2.displayBorrowedBooks();

        // Returning books
        library.returnBook("123", member1);
        library.returnBook("456", member2);

        // Displaying available books after returning
        library.displayAvailableBooks();
    }
}
