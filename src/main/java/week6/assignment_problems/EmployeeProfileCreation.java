package main.java.week6.assignment_problems;

class Employee {

    String empId;
    String empName;
    double salary;
    boolean isIntern;

    // 3-arg constructor for permanent employees[cite: 5]
    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    // 2-arg constructor chaining via this(...) for interns[cite: 5]
    public Employee(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true; // Sets isIntern to true afterwards[cite: 5]
    }

    void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }
}

public class EmployeeProfileCreation {

    public static void main(String[] args) {
        Employee emp1 = new Employee("E101", "Divya", 65000);
        Employee emp2 = new Employee("E102", "Arjun");

        emp1.printProfile();
        emp2.printProfile();
    }
}
