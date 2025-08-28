import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a float number: ");
    float f = input.nextFloat();

    int intValue = (int) f;

    byte byteValue = (byte) f;

    String stringValue = String.valueOf(f);

    System.out.println("Original Float number is: "+ f);
    System.out.println("Converted Integer value is: " +intValue);
    System.out.println("Converted Byte value is: " +byteValue);
    System.out.println("Converted String value is: " +stringValue);


    }
}