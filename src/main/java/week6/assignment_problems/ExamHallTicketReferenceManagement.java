package main.java.week6.assignment_problems;

class HallTicket {

    String studentName;
    int seatNumber;

    public HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class ExamHallTicketReferenceManagement {

    public static void main(String[] args) {
        HallTicket priya = new HallTicket("Priya", 0);
        HallTicket copy = priya; // Points to the same object[cite: 5]

        copy.seatNumber = 45; // Modified via copy reference[cite: 5]

        System.out.println("Priya's seatNumber (via first variable): " + priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));

        HallTicket separate = new HallTicket("Priya", 45); // Separate object with identical fields[cite: 5]
        System.out.println("separate == priya: " + (separate == priya));
    }
}
