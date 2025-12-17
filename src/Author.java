import java.time.LocalDate;
import java.util.Date;

public class Author {
    // Counter
    private static int counter = 0;     // Counter for auto-increment ID

    // Attributes
    private int id;
    private String name;
    private LocalDate dateBirth;

    // Constructor
    public Author(String name, LocalDate dateBirth){
        this.id = ++counter;
        this.name = name;
        this.dateBirth = dateBirth;
    }

    // Methods
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public LocalDate getDateBirth(){
        return dateBirth;
    }
}
