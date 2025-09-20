/* 
public class IF_Practice {
    public static void main(String[] args){
        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 800){
            System.out.println("Your score is 800");
        }
        else if(score == 1000){
            System.out.println("Your score is 1000");
        }
        else if(score > 1000 && score < 5000){
            System.out.println("Your score is greater than 1000 but less than 5000");
        }
        else{
            System.out.println("Your score is less than 800");
        }

        if(gameOver){
            int finalScore = score + 
        }
    }
}

*/

public class IF_Practice {
    public static void main(String[] args){
        int Score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        boolean gameOver = true;

        int finalScore = Score + (levelCompleted * bonus);
        System.out.println("Your final score was " + finalScore);

        if(gameOver){
            int secondFinalScore = Score + (levelCompleted * bonus);
            System.out.println("Your final score was " + secondFinalScore);
        }

    }
    
}