package main.java.week5.assignment_problems;

public class MatchDayGridAnalyzer {

    // Helper method to compute average of a single match row[cite: 1]
    private static double rowAverage(int[] row) {
        double sum = 0;
        for (int runs : row) {
            sum += runs;
        }
        return row.length > 0 ? sum / row.length : 0.0;
    }

    // Classifies matches based on threshold[cite: 1]
    static String classifyMatches(int[][] runsPerOver, int threshold) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < runsPerOver.length; i++) {
            double avg = rowAverage(runsPerOver[i]); // Call helper method once per row[cite: 1]
            String classification = (avg >= threshold) ? "Power Surge" : "Normal"; // Apply rule[cite: 1]

            result.append("Match ").append(i).append(": ").append(classification);
            if (i < runsPerOver.length - 1) {
                result.append(" | ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[][] runs = {
            {4, 6, 8},
            {10, 12, 14},
            {2, 3, 1}
        };
        System.out.println(classifyMatches(runs, 8));
        // Output: Match 0: Normal | Match 1: Power Surge | Match 2: Normal[cite: 1]
    }
}
