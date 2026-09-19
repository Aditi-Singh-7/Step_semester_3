package main.java.week7.assignment_problems;

class PasswordChecker {

    private final String password; // Private, no getter[cite: 7]

    public PasswordChecker(String password) {
        this.password = password;
    }

    public String getStrength() {
        if (password.length() < 6) { // Weak: < 6[cite: 7]
            return "Weak";
        } else if (password.length() <= 9) { // Medium: 6-9[cite: 7]
            return "Medium";
        } else { // Strong: 10+[cite: 7]
            return "Strong";
        }
    }
}

public class PasswordCheckerMain {

    public static void main(String[] args) {
        PasswordChecker pc = new PasswordChecker("abcd");
        System.out.println("pc.getStrength() -> \"" + pc.getStrength() + "\"");

        PasswordChecker pc2 = new PasswordChecker("abcdefghij");
        System.out.println("pc2.getStrength() -> \"" + pc2.getStrength() + "\"");
    }
}
