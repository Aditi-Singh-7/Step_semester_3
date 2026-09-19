package main.java.week5.class_problems;

public class DuplicateTeamNameFinder {

    // Finds first duplicate team name using nested pairwise loop[cite: 2]
    static String findDuplicateTeam(String[] teamNames) {
        for (int i = 0; i < teamNames.length; i++) {
            for (int j = i + 1; j < teamNames.length; j++) {
                if (teamNames[i].equals(teamNames[j])) {
                    return "Duplicate Found: " + teamNames[i]; // Return first duplicate found[cite: 2]
                }
            }
        }
        return "No Duplicates Found"; // Return if no duplicates exist[cite: 2]
    }

    public static void main(String[] args) {
        String[] teams1 = {"ByteForce", "CodeCrafters", "ByteForce"};
        System.out.println(findDuplicateTeam(teams1)); // Output: Duplicate Found: ByteForce[cite: 2]

        String[] teams2 = {"ByteForce", "CodeCrafters", "NullPointers"};
        System.out.println(findDuplicateTeam(teams2)); // Output: No Duplicates Found[cite: 2]
    }
}
