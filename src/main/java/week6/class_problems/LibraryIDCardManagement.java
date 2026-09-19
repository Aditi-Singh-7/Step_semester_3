package main.java.week6.class_problems;

class IdCard {

    String name;
    int booksIssued;

    public IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }
}

public class LibraryIDCardManagement {

    public static void main(String[] args) {
        IdCard ravi = new IdCard("Ravi", 0);
        IdCard duplicate = ravi; // Pointing to the same object[cite: 6]

        duplicate.booksIssued = 3; // Modifying via duplicate reference[cite: 6]

        System.out.println("Ravi's booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));

        IdCard separate = new IdCard("Ravi", 3); // Separate object with same values[cite: 6]
        System.out.println("separate == ravi: " + (separate == ravi));
    }
}
