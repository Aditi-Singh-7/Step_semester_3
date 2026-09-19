package main.java.week7.class_problems;

class PiggyBank {

    private final String id; // Fixed ID
    private double savings;

    public PiggyBank(String id) {
        this.id = id;
        this.savings = 0.0; // Starts at 0 savings
    }

    public String getId() {
        return id;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            savings += amount; // Adds exact amount
            System.out.println("pb.deposit(" + (int) amount + ") -> savings = " + (int) savings);
        }
    }

    public void withdraw(double amount) {
        if (amount > savings) { // Larger withdrawal rejected
            System.out.println("pb.withdraw(" + (int) amount + ") -> rejected, savings stays " + (int) savings);
        } else {
            savings -= amount;
            System.out.println("pb.withdraw(" + (int) amount + ") -> savings = " + (int) savings);
        }
    }

    public double getSavings() {
        return savings; // Read-only access[cite: 8]
    }
}

public class PiggyBankMain {

    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        pb.deposit(100);
        pb.withdraw(30);
        pb.withdraw(500);
    }
}
