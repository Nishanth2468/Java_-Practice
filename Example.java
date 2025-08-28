import java.util.*;

public class Example {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first variable value:");
        int a = sc.nextInt();
        System.out.println("Enter the second variable value:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + (sum / 2.0));
        sc.close();
    }

}


