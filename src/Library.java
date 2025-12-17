import java.util.ArrayList;
import java.util.List;

public class Library {

    // Attributes
    private List<Book> books;
    private List<Author> authors;
    private List<Loan> loans;

    // Constructor
    public Library(){
        this.books = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    // Methods - Books
    public void addBook(Book book){
        books.add(book);
    }
    public List<Book> getBooks(){
            return books;
    }
    public Book getBookById(int id){
        for(Book book : books){
            if (book.getId() == id){
                return book;
            }
        }
        return null;        // If book not found
    }

    // Methods - Authors
    public void addAuthor(Author author){
        authors.add(author);
    }
    public List<Author> getAuthors() {
        return authors;
    }

    // Methods - Loans
    public void addLoan(Loan loan) {
        loans.add(loan);
    }
    public List<Loan> getLoans() {
        return loans;
    }
}
