package main.java.string.class_problems;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingChar(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }

    public static void test(String text) {
        char result = findFirstNonRepeatingChar(text);
        if (result != '\0') {
            System.out.println("Input: \"" + text + "\" -> First Non-Repeating Character: '" + result + "'");
        } else {
            System.out.println("Input: \"" + text + "\" -> No Non-Repeating Character Found");
        }
    }

    public static void main(String[] args) {
        test("swiss");
        test("aabbcc");
    }
}
