package main.java.week5.class_problems;

import java.util.Arrays;

class Candidate implements Comparable<Candidate> {

    String name;
    double cgpa;
    int codingScore;

    // Constructor[cite: 2]
    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    // Overloaded eligibility check #1: CGPA >= 7.5[cite: 2]
    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    // Overloaded eligibility check #2: Borderline CGPA >= 6.5 AND Coding Score >= 60[cite: 2]
    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    // Calculate composite score for ranking[cite: 2]
    public double getCompositeScore() {
        return (cgpa * 10) + codingScore;
    }

    // Sort descending by composite score[cite: 2]
    @Override
    public int compareTo(Candidate other) {
        return Double.compare(other.getCompositeScore(), this.getCompositeScore());
    }
}

public class PlacementDriveShortlistingRankingEngine {

    static String shortlistAndRank(Candidate[] candidates) {
        // Step 1: Count eligible candidates[cite: 2]
        int count = 0;
        for (Candidate c : candidates) {
            if (Candidate.isEligible(c.cgpa) || Candidate.isEligible(c.cgpa, c.codingScore)) {
                count++;
            }
        }

        // Step 2: Populate shortlisted array[cite: 2]
        Candidate[] shortlisted = new Candidate[count];
        int idx = 0;
        for (Candidate c : candidates) {
            if (Candidate.isEligible(c.cgpa) || Candidate.isEligible(c.cgpa, c.codingScore)) {
                shortlisted[idx++] = c;
            }
        }

        // Step 3: Sort using Arrays.sort with Comparable implementation[cite: 2]
        Arrays.sort(shortlisted);

        // Step 4: Format output string[cite: 2]
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shortlisted.length; i++) {
            sb.append(i + 1).append(". ")
                    .append(shortlisted[i].name)
                    .append(" (").append(shortlisted[i].getCompositeScore()).append(")");
            if (i < shortlisted.length - 1) {
                sb.append(" | ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(candidates));
        // Output: 1. Aisha (122.0) | 2. Rohit (133.0) | 3. Karan (95.0)[cite: 2]
    }
}
