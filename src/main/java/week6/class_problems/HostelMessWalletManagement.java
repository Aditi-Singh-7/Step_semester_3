package main.java.week6.class_problems;

class MessWallet {

    private double balance;

    // Public constructor with negative check[cite: 6]
    public MessWallet(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Warning: Initial balance cannot be negative. Setting balance to 0.0.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

    // Top up wallet balance[cite: 6]
    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected: Amount must be greater than 0");
        } else {
            this.balance += amount;
            System.out.println("Balance after top-up: " + this.balance);
        }
    }

    // Deduct amount with insufficient balance check[cite: 6]
    public void deduct(double amount) {
        if (amount > this.balance) {
            System.out.println("Deduct rejected: insufficient balance");
        } else {
            this.balance -= amount;
        }
    }

    // Read-only getter[cite: 6]
    public double getBalance() {
        return balance;
    }
}

public class HostelMessWalletManagement {

    public static void main(String[] args) {
        MessWallet wallet = new MessWallet(500);
        wallet.topUp(200);
        wallet.deduct(1000);
        System.out.println("Final balance: " + wallet.getBalance());
    }
}
