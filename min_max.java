public class min_max{
    public static void main(String[] args) {
        int[] number = {5, 35, 40, 20, 8, 16, 32};
        int max = number[0];
        int min = number[0];

        for(int i = 0; i < number.length; i++){
            if(number[i] > max){
                max = number[i];
            }
            if(number[i] < min){
                min = number[i];
            }
        }
        System.out.println("Final max: " + max);
        System.out.println("Final min: " + min);
    }
}