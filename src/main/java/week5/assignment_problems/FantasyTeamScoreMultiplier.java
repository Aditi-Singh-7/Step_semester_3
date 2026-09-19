package main.java.week5.assignment_problems;

import java.util.Arrays;

public class FantasyTeamScoreMultiplier {

    // Modifies array in-place by applying multipliers directly to indices
    static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) {
        playerScores[captainIndex] *= 2.0;      // Captain gets 2x points
        playerScores[viceCaptainIndex] *= 1.5;  // Vice-Captain gets 1.5x points
    }

    public static void main(String[] args) {
        double[] scores = {40.0, 55.0, 30.0, 62.0};
        applyMultipliers(scores, 1, 3);
        System.out.println(Arrays.toString(scores)); // Output: [40.0, 110.0, 30.0, 93.0]
    }
}
