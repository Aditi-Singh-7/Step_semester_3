package main.java.week7.class_problems;

class Locker {

    private final int lockerNumber; // Fixed locker number[cite: 8]
    private String combinationCode; // Private code with no getter[cite: 8]

    public Locker(int lockerNumber, String combinationCode) {
        this.lockerNumber = lockerNumber;
        this.combinationCode = combinationCode;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public boolean changeCode(String currentCode, String newCode) {
        if (this.combinationCode.equals(currentCode)) { // Requires current code to match[cite: 8]
            this.combinationCode = newCode;
            System.out.println("l.changeCode(\"" + currentCode + "\", \"" + newCode + "\") -> success");
            return true;
        } else {
            System.out.println("l.changeCode(\"" + currentCode + "\", \"" + newCode + "\") -> rejected, code is still \"" + this.combinationCode + "\"");
            return false;
        }
    }
}

public class LockerCodeMain {

    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");
        l.changeCode("1234", "5678");
        l.changeCode("0000", "9999");
    }
}
