public class Switch {
    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1){
//            System.out.println("Value was 1");
//        }else if(value == 2){
//            System.out.println("Value was 2");
//        }else {
//            System.out.println("Value was not 1 or 2");
//        }
        int switchvalue = 2;
        switch (switchvalue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4 or a 5");
                System.out.println("Actually it was a " + switchvalue);
            }
            default -> System.out.println("Value was not 1, 2, 3, 4, or 5");
        }

        System.out.println(getQuarter("JANUARsY"));


    }
    public static  String getQuarter(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DEZEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield  badResponse;
            }
        };
    }
}
