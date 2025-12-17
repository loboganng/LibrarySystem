import java.time.LocalDate;
import java.util.Date;

public class Book {
    // Counter
    private static int counter = 0;     // To auto-increment ID

    // Attributes
    private int id;
    private String title;
    private String author;
    private boolean available = true;
    private final LocalDate dateRegistered;
    private LocalDate dateUpdated;

    // Construtor
    public Book(String title, String author, LocalDate dateRegistered){
        this.id = ++counter;
        this.title = title;
        this.author = author;
        this.dateRegistered = dateRegistered;
    }

    // Methods
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean getAvailable(){
        return available;
    }
    public void setAvailable(){
        this.available = true;
    }
    public void setUnAvailable(){
        this.available = false;
    }
    public LocalDate getDateRegistered(){
        return dateRegistered;
    }
    public LocalDate getDateUpdated(){
        return dateUpdated;
    }
}
