import java.util.Scanner;

public class Speed_Cal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input distance and time
        System.out.print("Enter distance (in meters): ");
        int distance = sc.nextInt();

        System.out.print("Enter time (in seconds): ");
        double time = sc.nextDouble();

        //Calculate Speed as Double
        double speed = distance / time;
        System.out.println("Speed: " + speed + " m/s");

        // Explicit type casting (double → int)
        int speedInt = (int) speed;
        System.out.println("Speed (after casting to int): " + speedInt);

        // Explain data loss
        System.out.println("Data Loss: Decimal part " + (speed - speedInt) 
                           + " is removed when converting double to int.");
        
        sc.close();
    }
}