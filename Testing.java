public class Testing {
    public static void main(String[] args) {
        boolean isRaining = false;
        if(!isRaining) {
            System.out.println("You can go out without umberella");
        }

        String makeOFCar  = "BMW";
        boolean IsDomestic = makeOFCar == "BMW" ? false : true;
        System.out.println("Is the car domestic? " + IsDomestic);

        if(IsDomestic) {
            System.out.println("This car is domestic to our country!");
        }

        double MyFirstVareiable = 20.00d;
        double MySecondVareiable = 80.00d;
        double MyTotal = MyFirstVareiable + MySecondVareiable * 100.00d;
        /*
        There is a Difference between this two statements:
        double MyTotal = (MyFirstVareiable + MySecondVareiable) * 100.00d;
        The OutPut of this Statement is:
        10000.0 and the Reminder is 0.0 
        But,
        double MyTotal = MyFirstVareiable + MySecondVareiable * 100.00d;
        The OutPut of this Statement is:
        8020 an the Reminder is 20.0
        */
        System.out.println("MyTotal = " + MyTotal);

        double Reminder = MyTotal % 40.00d;
        System.out.println("The Reminder is: " + Reminder);

        boolean IsReminder_Zero = (Reminder == 0) ? true : false;
        System.out.println("The Reminder is it Zero or Not?\nLets see: " + IsReminder_Zero);

    }
}