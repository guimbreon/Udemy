public class MethodOverloadingChallenge {
    public static void main(String[] args) {

    }
    // 1 inch = 2,54cm
    // 1 foot = 12 inches
    public  static double convertToCentimeters(int intireHeight){
        double centims = intireHeight * 2.54D;
        return  centims;
    }
    public  static double convertToCentimeters(int intireHeight, int intireinches) {
        double total;

        total = intireHeight * 2.54 + ((intireinches)*12)*2.54;

        return total;
    }

    }
