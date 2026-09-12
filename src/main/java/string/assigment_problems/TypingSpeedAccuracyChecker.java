package main.java.string.assigment_problems;

public class TypingSpeedAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        int total = original.length();
        int matched = 0;
        int firstMismatchIndex = -1;

        for (int i = 0; i < total; i++) {
            if (i < typed.length() && original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatchIndex == -1) {
                firstMismatchIndex = i + 1;
            }
        }

        double accuracy = ((double) matched / total) * 100;
        System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | ", matched, total, accuracy);

        if (firstMismatchIndex == -1 && original.length() == typed.length()) {
            System.out.println("No Mismatches");
        } else {
            char origChar = original.charAt(firstMismatchIndex - 1);
            char typedChar = (firstMismatchIndex - 1 < typed.length()) ? typed.charAt(firstMismatchIndex - 1) : ' ';
            System.out.printf("First Mismatch at position %d ('%c' vs '%c')\n", firstMismatchIndex, origChar, typedChar);
        }
    }

    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
        checkTypingAccuracy("coding", "coding");
    }
}
