package main.java.week7.class_problems;

class Scorecard {

    private final boolean[] results; // Private array of results[cite: 8]
    private final int totalQuestions;
    private int count;

    public Scorecard(int totalQuestions) {
        this.totalQuestions = totalQuestions;
        this.results = new boolean[totalQuestions];
        this.count = 0;
    }

    public void recordAnswer(boolean isCorrect) {
        if (count < totalQuestions) { // Ignores extra answers[cite: 8]
            results[count] = isCorrect;
            count++;
        }
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < count; i++) {
            if (results[i]) {
                score++;
            }
        }
        return score; // Returns count of correct answers[cite: 8]
    }
}

public class QuizScorecardMain {

    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println("sc.getScore() -> " + sc.getScore());
    }
}
