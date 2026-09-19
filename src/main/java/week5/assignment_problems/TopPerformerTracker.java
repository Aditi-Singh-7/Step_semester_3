package main.java.week5.assignment_problems;

public class TopPerformerTracker {

    // Finds Min, Max, and Spread in a single pass without sorting[cite: 1]
    static String findMinMaxSpread(int[] scores) {
        int min = scores[0];
        int max = scores[0];

        for (int score : scores) {
            if (score < min) {
                min = score;
            }
            if (score > max) {
                max = score;
            }
        }

        int spread = max - min; // Calculate spread[cite: 1]
        return "Min: " + min + " Max: " + max + " Spread: " + spread; // Format string output[cite: 1]
    }

    public static void main(String[] args) {
        int[] scores = {45, 82, 79, 90, 33, 90, 61};
        System.out.println(findMinMaxSpread(scores)); // Output: Min: 33 Max: 90 Spread: 57[cite: 1]
    }
}
