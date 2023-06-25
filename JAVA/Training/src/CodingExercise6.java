public class CodingExercise6 {
    public static void main(String[] args) {
        double firstDouble;
        double secondDouble;
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstDouble,double secondDouble) {
        int scaledNum1 = (int) (firstDouble * 1000);
        int scaledNum2 = (int) (secondDouble * 1000);
    return scaledNum1 == scaledNum2;
    }
}
