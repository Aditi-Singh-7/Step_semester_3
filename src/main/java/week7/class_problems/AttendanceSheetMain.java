package main.java.week7.class_problems;

class AttendanceSheet {

    private final String[] presentStudents; // Private array[cite: 8]
    private int count;

    public AttendanceSheet(int maxCapacity) {
        this.presentStudents = new String[maxCapacity];
        this.count = 0;
    }

    public void markPresent(String studentName) {
        if (!isPresent(studentName) && count < presentStudents.length) { // Prevents duplicates[cite: 8]
            presentStudents[count] = studentName;
            count++;
        }
    }

    public int getPresentCount() {
        return count; // Returns present count[cite: 8]
    }

    public boolean isPresent(String studentName) {
        for (int i = 0; i < count; i++) {
            if (presentStudents[i].equals(studentName)) { // Checks if student is present[cite: 8]
                return true;
            }
        }
        return false;
    }
}

public class AttendanceSheetMain {

    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana"); // Ignored duplicate[cite: 8]

        System.out.println("sheet.getPresentCount() -> " + sheet.getPresentCount());
        System.out.println("sheet.isPresent(\"Ben\") -> " + sheet.isPresent("Ben"));
    }
}
