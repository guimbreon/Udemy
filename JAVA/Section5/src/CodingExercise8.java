public class CodingExercise8 {
    public static void main(String[] args) {

    }

    public static boolean hasTeen(int num1, int num2 ,int num3) {
        boolean TrueFalse = (13 <= num1 && num1 <= 19 ||
                13 <= num2 && num2 <= 19 ||
                13 <= num3 && num3 <= 19 );

        return  TrueFalse;
    }

    public static boolean isTeen(int num4) {
        boolean TrueFalse = (13 <= num4 && num4 <= 19 );
        return  TrueFalse;
    }
}
