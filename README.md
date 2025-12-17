Vila Velha University Library System

The Vila Velha University Library System is a Java-based console application designed to streamline the process of managing literary collections and student rentals. 
Developed with a focus on clean code and reliable architecture, the system provides a seamless interface for browsing available titles 
and registering loans with automated return date calculations.

System Architecture

At its core, the application is built on a modular structure where the Library class acts as the central hub. 
This controller manages the relationships between Books, Authors, and Loans. Every entity in the system is uniquely identified via an auto-incrementing ID system, 
ensuring data integrity even as the collection grows. The implementation relies heavily on the Java Collections Framework to handle dynamic data storage 
and the modern java.time API for precise tracking of rental periods.

Functional Workflow
When a user interacts with the system, they are presented with a persistent navigation menu. The application first validates the user's intent before displaying the catalog. 
Upon selecting a book, the system performs a real-time availability check. If the book is available, the software captures the client's information, 
updates the book's status to unavailable, and generates a loan receipt that includes a strictly formatted return date, 
typically set for seven days from the initial transaction.

Reliability and Input Handling
A significant portion of the development was dedicated to "defensive programming." Unlike standard CLI tools that might crash on unexpected input, 
this system is equipped with an advanced input validation layer. It specifically handles the common "Scanner closure" pitfall by maintaining a single, 
managed stream for the entire lifecycle of the program. It also features a buffer-clearing mechanism that prevents the application from skipping text prompts 
after numerical entries, ensuring a smooth and frustration-free user experience.

Installation and Execution
To run the system locally, ensure you have the Java Development Kit (JDK) installed. Begin by compiling the source files using javac *.java from your terminal. 
Once compiled, launch the program with the command java Main. The system initializes with a pre-loaded catalog of classic authors like J.R.R. Tolkien and George R.R. Martin, 
allowing you to test the rental logic immediately.
