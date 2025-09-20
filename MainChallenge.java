public class MainChallenge {

    public static void main(String[] args){
        /* 
        int Score = 800;
        int levelCompleted = 4;
        int bonus = 100;
        boolean gameOver = true;

        int finalScore = Score;
        OR THERE IS ANOTHER METHOD THAT IS: KEEPING THE VALUES IN THE METHOD AND CALLING THE METHOD.
        */

        int highScore = calculateScore(800,4, 100, true);
        System.out.println("Your high score is: " + highScore); // One way to call a method.


        System.out.println("The next high score is: " +
            calculateScore(1000, 8, 200, true)); // Another way to call a method.
    }

    public static int calculateScore(int score, int levelCompleted, int bonus, boolean gameOver) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
    
}
