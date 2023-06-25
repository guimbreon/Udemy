public class CodingExercise4 {
    public static void main(String[] args) {
        int year = 1980;
        System.out.println(isLeapYear(year));

    }

    public static boolean isLeapYear(int year) {
        boolean TrueFalse;
        if (year >=1 && year <= 9999){
            TrueFalse = (year % 4 == 0 && year % 100 == 0 && year % 400 == 0);
            System.out.println("a");
        }else {
            TrueFalse = false;
        }
        return TrueFalse;
    }
}
