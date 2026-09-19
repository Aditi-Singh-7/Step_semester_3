package main.java.week6.assignment_problems;

class CompanyEmployee {

    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies"; // Shared static field[cite: 5]
    static int employeeCount = 0; // Shared counter[cite: 5]

    public CompanyEmployee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++; // Increments inside constructor[cite: 5]
    }

    // Static method accessing static fields[cite: 5]
    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class EmployeeAndCompanyInformationManagement {

    public static void main(String[] args) {
        new CompanyEmployee("Aarav", 50000);
        new CompanyEmployee("Bhavna", 60000);
        new CompanyEmployee("Chetan", 55000);

        // Call printCompanyInfo through class name[cite: 5]
        CompanyEmployee.printCompanyInfo();
    }
}
