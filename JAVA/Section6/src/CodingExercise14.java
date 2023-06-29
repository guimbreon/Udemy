public class CodingExercise14 {
    public static void main(String[] args) {
        int year = 2000;
        System.out.println(getDaysInMonth(2,2020));
    }
    public static boolean isLeapYear(int year){
        boolean what;
        if (year <= 9999 && year >= 1){
            if (year%4 == 0 && year%100==0 && year%400 == 0){
                what = true;
            }else{
                what = false;
            }
        }else{
            what = false;
        }
        return what;
    }

    public static int getDaysInMonth(int month,int year){
        int thing;
        if (month > 1 && month <12 && year <= 9999 && year >= 1){
            if (isLeapYear(year)){
                switch (month) {
                    case 1 -> {
                        thing = 31;
                    }
                    case 2 -> {
                        thing = 28;
                    }
                    case 3 -> {
                        thing = 31;
                    }
                    case 4 -> {
                        thing = 30;
                    }
                    case 5 -> {
                        thing = 31;
                    }
                    case 6 -> {
                        thing = 30;
                    }
                    case 7 -> {
                        thing = 31;
                    }
                    case 8 -> {
                        thing = 31;
                    }
                    case 9 -> {
                        thing = 30;
                    }
                    case 10 -> {
                        thing = 31;
                    }
                    case 11 -> {
                        thing = 30;
                    }
                    case 12 -> {
                        thing = 31;
                    }
                    default -> {
                        thing = -1;
                    }
                }
            }else {
                switch (month) {
                    case 1 -> {
                        thing = 31;
                    }
                    case 2 -> {
                        thing = 29;
                    }
                    case 3 -> {
                        thing = 31;
                    }
                    case 4 -> {
                        thing = 30;
                    }
                    case 5 -> {
                        thing = 31;
                    }
                    case 6 -> {
                        thing = 30;
                    }
                    case 7 -> {
                        thing = 31;
                    }
                    case 8 -> {
                        thing = 31;
                    }
                    case 9 -> {
                        thing = 30;
                    }
                    case 10 -> {
                        thing = 31;
                    }
                    case 11 -> {
                        thing = 30;
                    }
                    case 12 -> {
                        thing = 31;
                    }
                    default -> {
                        thing = -1;
                    }
                }
            }
        }else{
        thing = -1;
        }
        return thing;
    }
}

