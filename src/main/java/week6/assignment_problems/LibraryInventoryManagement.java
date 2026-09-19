package main.java.week6.assignment_problems;

class BookInventory {

    String title;
    String author;
    int copiesAvailable;

    // Constructor
    public BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    // Formatted line entry printer
    void printEntry() {
        System.out.println(title + " by " + author + " " + copiesAvailable + " copies available");
    }
}

public class LibraryInventoryManagement {

    public static void main(String[] args) {
        BookInventory[] inventory = new BookInventory[]{
            new BookInventory("Clean Code", "Robert C. Martin", 3),
            new BookInventory("Effective Java", "Joshua Bloch", 5),
            new BookInventory("Refactoring", "Martin Fowler", 0),
            new BookInventory("Design Patterns", "GoF", 2)
        };

        for (BookInventory book : inventory) {
            book.printEntry(); // Print each entry in loop
        }
    }
}
