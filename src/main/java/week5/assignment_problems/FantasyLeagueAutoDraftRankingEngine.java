package main.java.week5.assignment_problems;

import java.util.Arrays;

class Player implements Comparable<Player> {

    String name;
    int matchesPlayed;
    double battingAverage;
    boolean injured;

    // Constructor[cite: 1]
    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    // Overloaded isDraftable check #1: Experience only (threshold >= 10)[cite: 1]
    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    // Overloaded isDraftable check #2: Experience & Fitness (matches >= 5 and not injured)[cite: 1]
    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    // Compare by fantasy points (batting average) descending for Arrays.sort[cite: 1]
    @Override
    public int compareTo(Player other) {
        return Double.compare(other.battingAverage, this.battingAverage);
    }
}

public class FantasyLeagueAutoDraftRankingEngine {

    static String draftAndRank(Player[] players) {
        // Step 1: Count draftable players[cite: 1]
        int count = 0;
        for (Player p : players) {
            if (Player.isDraftable(p.matchesPlayed) || Player.isDraftable(p.matchesPlayed, p.injured)) {
                count++;
            }
        }

        // Step 2: Populate draftable array[cite: 1]
        Player[] draftable = new Player[count];
        int idx = 0;
        for (Player p : players) {
            if (Player.isDraftable(p.matchesPlayed) || Player.isDraftable(p.matchesPlayed, p.injured)) {
                draftable[idx++] = p;
            }
        }

        // Step 3: Sort using Comparable implementation[cite: 1]
        Arrays.sort(draftable);

        // Step 4: Format output[cite: 1]
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < draftable.length; i++) {
            sb.append(i + 1).append(". ").append(draftable[i].name);
            if (i < draftable.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Player[] pool = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(pool)); // Output: 1. Rahul 2. Virat 3. Dev[cite: 1]
    }
}
