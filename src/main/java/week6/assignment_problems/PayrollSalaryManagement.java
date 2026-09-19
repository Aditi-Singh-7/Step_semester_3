package main.java.week6.assignment_problems;

class PayrollAccount {

    private double basicSalary;
    private double bonus;

    // Constructor with negative salary handling[cite: 5]
    public PayrollAccount(double basicSalary) {
        if (basicSalary < 0) {
            System.out.println("Warning: Basic salary cannot be negative. Setting basic salary to 0.0.");
            this.basicSalary = 0;
        } else {
            this.basicSalary = basicSalary;
        }
        this.bonus = 0;
    }

    // Credit bonus method[cite: 5]
    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Bonus rejected: Amount must be greater than 0");
        } else {
            this.bonus += amount;
            System.out.println("Bonus credited: Rs " + amount);
        }
    }

    // Deduct tax method[cite: 5]
    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Tax deduction rejected: Percentage must be between 0 and 100");
        } else {
            this.basicSalary -= (this.basicSalary * (percent / 100.0));
            System.out.println("Tax deducted: " + (int) percent + "%");
        }
    }

    // Read-only net salary calculation[cite: 5]
    public double getNetSalary() {
        return basicSalary + bonus;
    }
}

public class PayrollSalaryManagement {

    public static void main(String[] args) {
        PayrollAccount account = new PayrollAccount(50000);
        account.creditBonus(5000);
        account.deductTax(10);
        System.out.println("Net salary: Rs " + account.getNetSalary());
    }
}
