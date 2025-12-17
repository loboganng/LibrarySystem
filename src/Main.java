//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        // Creating Date formatter
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//
//        // Criando Library
//        Library library = new Library();
//
//        // Criando Authors
//        library.addAuthor(new Author("J. K. Rowling", LocalDate.of(1980, 10, 10)));
//        library.addAuthor(new Author("J. R. R. Tolkien", LocalDate.of(1892, 1, 3)));
//        library.addAuthor(new Author("George R. R. Martin", LocalDate.of(1963, 8, 5)));
//
//        // Criando books
//        library.addBook(new Book("Harry Potter", "J. K. Rowling", LocalDate.of(2015, 10, 1)));
//        library.addBook(new Book("Lord of The Rings", "J. R. R. Tolkien", LocalDate.of(2015, 10, 1)));
//        library.addBook(new Book("Game of Thrones", "George R. R. Martin", LocalDate.of(2015, 10, 1)));
//
//
//        boolean cont = true;
//
//        // Menu inicial
//        while(cont){
//            System.out.println("---------------------------------------------------");
//            System.out.println("Welcome to the Vila Velha University Library System");
//            System.out.println("---------------------------------------------------");
//
//            char option = 'y';
//            int choice = 0;
//
//            // Input of user
//            try(Scanner scanner = new Scanner(System.in)){
//                do{
//                    System.out.print("Would you like to see the available books? (Y/N) ");
//                    option = scanner.next().toLowerCase().charAt(0);
//
//                    if (option != 'y' && option != 'n'){
//                        System.out.println("Invalid option. Type only Y or N.");
//                    }
//                }
//                while (option != 'y' && option != 'n');
//            }
//            catch (Exception e){
//                System.out.println("Error reading input! Try again.");
//            }
//            System.out.println();
//
//            // Printing list of books
//            if (option == 'y'){
//                for(Book book : library.getBooks()) {
//                    System.out.println("(" + book.getId() + ")");
//                    System.out.println("Title: " + book.getTitle());
//                    System.out.println("Author: " + book.getAuthor());
//                    System.out.println("----------------------------------");
//                    System.out.println();
//                }
//
//                // Input of book user would like to see
//                try(Scanner scanner = new Scanner(System.in)){
//                    boolean validChoice = false;
//                    do{
//                        System.out.print("Enter the book you'd like to rent (Numbers only): ");
//                        if (scanner.hasNextInt()){
//                            choice = scanner.nextInt();
//                            scanner.nextLine();
//                            validChoice = true;
//                        }
//                        else {
//                            System.out.println("Not a valid option.");
//                            scanner.nextLine();
//                        }
//                    } while (!validChoice);
//                }
//                catch (Exception e){
//                    System.out.println("Something went wrong. ");
//                }
//
//                // Printing options
//                switch (choice){
//                    case 1, 2, 3 -> {
//                        // Create variable to store book selection
//                        Book selectedBook = library.getBookById(choice);
//
//                        if (selectedBook == null){
//                            System.out.println("Book not found.");
//                        }
//                        else if (!selectedBook.getAvailable()){
//                            System.out.println("Sorry, this book is currently unavailable!");
//                        }
//                        else{
//                            // Get client name
//                            try (Scanner scanner = new Scanner(System.in)){
//                                System.out.print("Before renting, enter you name, please: ");
//                                String name = scanner.nextLine();
//                                // Set book unavailable
//                                library.getBookById(choice).setUnAvailable();
//                                // Creating Loan
//                                Loan loan = new Loan(selectedBook, name);
//                                library.addLoan(loan);
//                                // Printing details of rental
//                                System.out.println("Loan registered! Here are the details of our loan: ");
//                                System.out.println("Name of person: " + loan.getClientName());
//                                System.out.println("Name of book: " + loan.getBook());
//                                System.out.println("Date of rental: " + loan.getLoanDate().format(formatter));
//                                System.out.println("Date of return: " + loan.getReturnDate().format(formatter));
//                            }
//                            catch (Exception e){
//                                System.out.println("Something went wrong. ");
//                            }
//
//                            try (Scanner scanner = new Scanner(System.in)){
//                                System.out.println("Would you like to continue in the system? (Y/N)");
//                                char resp = scanner.next().toLowerCase().charAt(0);
//                                if(resp == 'n'){
//                                    cont = false;
//                                }
//                            }
//                            catch (Exception e){
//                                System.out.println("Something went wrong. ");
//                            }
//                        }
//                    }
//                    default -> {
//                        System.out.println("Something went wrong!");
//                    }
//                }
//            }
//            else if (option == 'n') {
//                System.out.println("Thank you for using our services! Have a great day");
//                cont = false;
//            }
//            else {
//                System.out.println("Invalid option!");
//            }
//        }
//    }
//}


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Library library = new Library();

        // Cadastro inicial
        library.addAuthor(new Author("J. K. Rowling", LocalDate.of(1980, 10, 10)));
        library.addAuthor(new Author("J. R. R. Tolkien", LocalDate.of(1892, 1, 3)));
        library.addAuthor(new Author("George R. R. Martin", LocalDate.of(1963, 8, 5)));

        library.addBook(new Book("Harry Potter", "J. K. Rowling", LocalDate.of(2015, 10, 1)));
        library.addBook(new Book("Lord of The Rings", "J. R. R. Tolkien", LocalDate.of(2015, 10, 1)));
        library.addBook(new Book("Game of Thrones", "George R. R. Martin", LocalDate.of(2015, 10, 1)));

        boolean cont = true;

        try (Scanner scanner = new Scanner(System.in)) {
            while (cont) {
                System.out.println("\n---------------------------------------------------");
                System.out.println("Welcome to the Vila Velha University Library System");
                System.out.println("---------------------------------------------------");

                char option;

                // Primeira pergunta (Y/N)
                do {
                    System.out.print("Would you like to see the available books? (Y/N) ");
                    String input = scanner.next().toLowerCase();
                    option = input.charAt(0);

                    if (option != 'y' && option != 'n') {
                        System.out.println("Invalid option. Type only Y or N.");
                    }
                } while (option != 'y' && option != 'n');

                if (option == 'y') {
                    // Mostrar livros
                    for (Book book : library.getBooks()) {
                        System.out.println("(" + book.getId() + ") " + book.getTitle() + " - " + book.getAuthor());
                    }

                    // Escolha do livro
                    int choice = -1;
                    boolean validChoice = false;
                    while (!validChoice) {
                        System.out.print("Enter the ID of the book you'd like to rent: ");
                        if (scanner.hasNextInt()) {
                            choice = scanner.nextInt();
                            scanner.nextLine(); // Limpa o buffer
                            validChoice = true;
                        } else {
                            System.out.println("Please, enter a number.");
                            scanner.next(); // Limpa o texto inválido
                        }
                    }

                    Book selectedBook = library.getBookById(choice);

                    if (selectedBook == null) {
                        System.out.println("Book not found.");
                    } else if (!selectedBook.getAvailable()) {
                        System.out.println("Sorry, this book is currently unavailable!");
                    } else {
                        // Nome do cliente
                        System.out.print("Before renting, enter your name: ");
                        String name = scanner.nextLine();

                        selectedBook.setUnAvailable();
                        Loan loan = new Loan(selectedBook, name);
                        library.addLoan(loan);

                        System.out.println("\nLoan registered successfully!");
                        System.out.println("Name: " + loan.getClientName());
                        System.out.println("Book: " + selectedBook.getTitle());
                        System.out.println("Return Date: " + loan.getReturnDate().format(formatter));
                    }

                    // Pergunta se deseja continuar
                    System.out.print("\nWould you like to continue in the system? (Y/N): ");
                    char resp = scanner.next().toLowerCase().charAt(0);
                    if (resp == 'n') cont = false;

                } else {
                    System.out.println("Thank you for using our services!");
                    cont = false;
                }
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}