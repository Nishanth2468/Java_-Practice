public class MetOver {

    public static void main(String[] args){
        System.out.println("Height in cm: " + converToCentimeters(5, 8  ));

        System.out.println("The Height only in CM: " + converToCentimeters(10));
    }

    public static double converToCentimeters(int inches){
        // one inch = 2.54 cm
        return (inches * 2.54);
    }

    public static double converToCentimeters(int feet, int inches){
        //Here HinF = Height in Feet and HinI = Height in Inches.
        // One inch = 12 feet.
        int totalInches = (feet * 12) + inches; //This calculates the total inches for the next method.

        return converToCentimeters(totalInches);// This returns totalInches to the previous method to calculate the total cm.

        /*
        OR we can directly calculate it here without calling the other method like this:
        return ((feet * 12) + inches) * 2.54;
        
        OR we can do it step by step like this:
        int totalInches = (feet * 12) + inches;
        double result = converToCentimeters(totalInches);
        return result;
        */
    }
    
}
