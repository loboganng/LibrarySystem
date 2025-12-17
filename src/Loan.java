import java.time.LocalDate;
import java.util.Date;

public class Loan {
    // Counter
    private static int counter = 0;      // Counter to auto-increment ID

    // Attributes
    private int id;
    private Book book;
    private String clientName;
    private LocalDate loanDate;
    private LocalDate returnDate;

    // Constructor
    public Loan(Book book, String clientName){
        this.id = ++counter;
        this.book = book;
        this.clientName = clientName;
        this.loanDate = LocalDate.now();
        this.returnDate = LocalDate.now().plusWeeks(1);
    }

    // Methods
    public int getId() {
        return id;
    }
    public String getBook() {
        return book.getTitle();
    }
    public String getClientName() {
        return clientName;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }
}
