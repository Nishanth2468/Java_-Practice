public class MethodChallange {
    public static void main(String[] args) {
        
        int HightScorePosition = CalculationHighScorePosition(1500);
        DisplayHighScorePosition("Timber", HightScorePosition);

        int HightScorePosition2 = CalculationHighScorePosition(900);
        DisplayHighScorePosition("Bob", HightScorePosition2);

        int HightScorePosition3 = CalculationHighScorePosition(400);
        DisplayHighScorePosition("Percy", HightScorePosition3);

        int HightScorePosition4 = CalculationHighScorePosition(50);
        DisplayHighScorePosition("Gilbert", HightScorePosition4);
    }

    public static void DisplayHighScorePosition(String PlayerName, int HightScorePosition){

        System.out.println(PlayerName + " Managed to get into the position " + HightScorePosition + " On the Hight Score List " );
    }
    
    public static int CalculationHighScorePosition(int PlayerScore){
        /* 
        if(PlayerScore >= 1000){
            return 1;
        }
        else if(PlayerScore >= 500 ){
            return 2;
        }
        else if(PlayerScore >=100 ){
            return 3;
        }
        else{
            return 4; // Or we can use return 4; insted of using else
        }
            */
        int position = 0; // Default value

        if(PlayerScore >= 1000){
            position = 1;
        }
        else if(PlayerScore >= 500 ){
            position = 2;
        }
        else if(PlayerScore >=100 ){
            position = 3;
        }
        else{
            position = 4;
        }

        return position;

    }
}
