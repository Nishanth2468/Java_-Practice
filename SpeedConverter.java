public class SpeedConverter {
    
    // Method to convert kilometers per hour to miles per hour
    public static long toMilesPerHour(double kilometersPerHour) {
        // Check if the parameter is less than 0
        if (kilometersPerHour < 0) {
            return -1; // Return -1 for invalid value
        }
        
        // Convert km/h to mi/h using the conversion factor: 1 km/h = 0.621371 mi/h
        double milesPerHour = kilometersPerHour * 0.621371;
        
        // Round the result and return as long
        return Math.round(milesPerHour);
    }
    
    // Method to print the conversion
    public static void printConversion(double kilometersPerHour) {
        // Check if the parameter is less than 0
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            // Calculate miles per hour using the toMilesPerHour method
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            
            // Print the conversion in the required format
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
    
    // Main method to test the methods
    public static void main(String[] args) {
        // Test the toMilesPerHour method
        System.out.println("Testing toMilesPerHour method:");
        System.out.println("toMilesPerHour(1.5): " + toMilesPerHour(1.5));
        System.out.println("toMilesPerHour(10.25): " + toMilesPerHour(10.25));
        System.out.println("toMilesPerHour(-5.6): " + toMilesPerHour(-5.6));
        System.out.println("toMilesPerHour(25.42): " + toMilesPerHour(25.42));
        System.out.println("toMilesPerHour(75.114): " + toMilesPerHour(75.114));
        
        System.out.println(); // Empty line for better readability
        
        // Test the printConversion method
        System.out.println("Testing printConversion method:");
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}