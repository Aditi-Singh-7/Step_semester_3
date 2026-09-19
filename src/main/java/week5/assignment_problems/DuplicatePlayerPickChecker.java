package main.java.week5.assignment_problems;

public class DuplicatePlayerPickChecker {

    // Checks for duplicate player names using nested loops[cite: 1]
    static String findDuplicatePick(String[] playerNames) {
        for (int i = 0; i < playerNames.length; i++) {
            for (int j = i + 1; j < playerNames.length; j++) {
                if (playerNames[i].equals(playerNames[j])) {
                    return "Duplicate Found: " + playerNames[i]; // Return first duplicate found[cite: 1]
                }
            }
        }
        return "No Duplicates Found"; // Return if no duplicates exist[cite: 1]
    }

    public static void main(String[] args) {
        String[] lineup1 = {"Kohli", "Bumrah", "Kohli", "Rohit"};
        System.out.println(findDuplicatePick(lineup1)); // Output: Duplicate Found: Kohli[cite: 1]

        String[] lineup2 = {"Kohli", "Bumrah", "Rohit"};
        System.out.println(findDuplicatePick(lineup2)); // Output: No Duplicates Found[cite: 1]
    }
}
