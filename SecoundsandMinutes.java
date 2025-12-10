public class SecoundsandMinutes {
    
    public static void main(String[] args){
        System.out.println(getDurationString(3665));
        System.out.println(getDurationString(61, 45));
        System.out.println(getDurationString(-50));
        System.out.println(getDurationString(65, 9));
    }

    // in the formate XXh YYm ZZs where XX represents hours, YY represents minutes and ZZ represents seconds.
    public static String getDurationString(int secounds){
        if(secounds < 0){
            return "Invalid Value";
        }

        int minutes = secounds / 60;
        int remainingSecounds = secounds % 60;

        return getDurationString(minutes, remainingSecounds);
        
    }

    public static String getDurationString(int minutes, int secounds){
        if(minutes < 0 || secounds < 0 || secounds > 59){
            return "Invalid Value";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + secounds + "s";
    }
}
