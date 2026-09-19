package main.java.week5.class_problems;

public class HackathonSeatingGridOptimizer {

    // Helper method to compute average of a row[cite: 2]
    private static double rowAverage(int[] row) {
        double sum = 0;
        for (int val : row) {
            sum += val;
        }
        return row.length > 0 ? sum / row.length : 0.0;
    }

    // Classifies rows into Quiet Zone or Buzzing Zone based on threshold[cite: 2]
    static String classifyRows(int[][] seatingScores, int threshold) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < seatingScores.length; i++) {
            double avg = rowAverage(seatingScores[i]); // Call helper once per row[cite: 2]
            String zone = (avg >= threshold) ? "Buzzing Zone" : "Quiet Zone"; // Apply rule[cite: 2]

            result.append("Row ").append(i).append(": ").append(zone);
            if (i < seatingScores.length - 1) {
                result.append(" | ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[][] seating = {
            {40, 50, 45},
            {85, 90, 95},
            {30, 20, 25}
        };
        System.out.println(classifyRows(seating, 60));
        // Output: Row 0: Quiet Zone | Row 1: Buzzing Zone | Row 2: Quiet Zone[cite: 2]
    }
}
