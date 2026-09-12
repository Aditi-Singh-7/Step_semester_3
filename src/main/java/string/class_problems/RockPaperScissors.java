package main.java.string.class_problems;

import java.util.Random;

public class RockPaperScissors {

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors"))
                || (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock"))
                || (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        } else {
            return "Computer Wins";
        }
    }

    public static void main(String[] args) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        Random random = new Random();

        int wins = 0, losses = 0, draws = 0;
        int totalRounds = 5;

        System.out.println("Round | Player Move | Computer Move | Result");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < totalRounds; i++) {
            String pMove = playerMoves[i];
            String cMove = moves[random.nextInt(3)];
            String result = playRound(pMove, cMove);

            if (result.equals("Player Wins")) {
                wins++; 
            }else if (result.equals("Computer Wins")) {
                losses++; 
            }else {
                draws++;
            }

            System.out.printf("%-5d | %-11s | %-13s | %s\n", (i + 1), pMove, cMove, result);
        }

        double winPercentage = ((double) wins / totalRounds) * 100;
        System.out.println("\nFinal Summary:");
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%\n", wins, losses, draws, winPercentage);
    }
}
