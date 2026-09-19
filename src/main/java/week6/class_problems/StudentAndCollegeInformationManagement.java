package main.java.week6.class_problems;

class Student {

    String name;
    double attendance;
    static String collegeName = "SRM Institute of Science and Technology"; // Shared static field[cite: 6]
    static int studentCount = 0; // Shared counter[cite: 6]

    public Student(String name, double attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++; // Increment counter on object creation[cite: 6]
    }

    // Static method accessing only static fields[cite: 6]
    static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class StudentAndCollegeInformationManagement {

    public static void main(String[] args) {
        new Student("Rahul", 85.0);
        new Student("Ananya", 92.5);

        // Called via class name, not instance[cite: 6]
        Student.printCollegeInfo();
    }
}
