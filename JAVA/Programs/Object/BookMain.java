class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean issued;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    void issueBook() {
        if (!issued) {
            issued = true;
            System.out.println(title + " has been issued.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    void returnBook() {
        if (issued) {
            issued = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not issued.");
        }
    }

    void displayBook() {
        System.out.println(
            bookId + " | " +
            title + " | " +
            author + " | " +
            (issued ? "Issued" : "Available")
        );
    }

    int getBookId() {
        return bookId;
    }
}


class Library {

    private String libraryName;
    private Book[] books;
    private int bookCount;

    Library(String libraryName, int capacity) {
        this.libraryName = libraryName;
        books = new Book[capacity];
        bookCount = 0;
    }

    void addBook(Book book) {

        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;

            System.out.println(
                "Book added: " + book.getBookId()
            );
        } else {
            System.out.println("Library is full.");
        }
    }

    Book findBook(int bookId) {

        for (int i = 0; i < bookCount; i++) {

            if (books[i].getBookId() == bookId) {
                return books[i];
            }
        }

        return null;
    }

    void issueBook(int bookId) {

        Book book = findBook(bookId);

        if (book != null) {
            book.issueBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    void returnBook(int bookId) {

        Book book = findBook(bookId);

        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    void displayBooks() {

        System.out.println("\n===== " + libraryName + " =====");

        System.out.println(
            "ID | Title | Author | Status"
        );

        for (int i = 0; i < bookCount; i++) {
            books[i].displayBook();
        }
    }
}


public class BookMain {

    public static void main(String[] args) {

        Library library =
            new Library("City Central Library", 5);

        // Creating Book objects
        Book book1 =
            new Book(101, "Java Programming", "James Gosling");

        Book book2 =
            new Book(102, "Data Structures", "Mark Allen");

        Book book3 =
            new Book(103, "Clean Code", "Robert Martin");

        // Adding books
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display books
        library.displayBooks();

        // Issue books
        System.out.println("\n--- Issuing Books ---");

        library.issueBook(101);
        library.issueBook(103);

        // Try issuing same book
        library.issueBook(101);

        // Display updated status
        library.displayBooks();

        // Return book
        System.out.println("\n--- Returning Book ---");

        library.returnBook(101);

        // Display final status
        library.displayBooks();
    }
}