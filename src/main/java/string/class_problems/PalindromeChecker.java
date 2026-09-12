package main.java.string.class_problems;

public class PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        return new String(reversed).equals(text);
    }

    public static void testWord(String text) {
        boolean it = isPalindromeIterative(text);
        boolean rec = isPalindromeRecursive(text);
        boolean arr = isPalindromeArrayReversal(text);

        System.out.printf("Input: \"%s\"\n", text);
        System.out.println("Iterative: " + (it ? "Palindrome" : "Not Palindrome")
                + " | Recursive: " + (rec ? "Palindrome" : "Not Palindrome")
                + " | Array Reversal: " + (arr ? "Palindrome" : "Not Palindrome") + "\n");
    }

    public static void main(String[] args) {
        testWord("madam");
        testWord("hello");
    }
}
