class Add_Cal{
     
     int add(int a, int b){
        return a + b;
     }

     double add(double a, double b){
        return a + b;
     }

     int add(int a, int b, int c){
        return a + b + c;
     }
}

public class Cal_Overloading {
    public static void main(String[] args) {
        Add_Cal obj = new Add_Cal();

        int sum1 = obj.add(2, 3);
        double sum2 = obj.add(2.5, 3.5);
        int sum3 = obj.add(2, 3, 4);

        System.out.println("The sum of a and b is: " + sum1);
        System.out.println("The sum of a and b is: " + sum2);
        System.out.println("The sum of a, b and c is: " + sum3);
    }
}