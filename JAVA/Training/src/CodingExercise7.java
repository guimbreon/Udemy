public class CodingExercise7 {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int num1, int num2, int sum) {
        boolean TrueFalse = (num1 + num2 == sum);
        return TrueFalse;
    }
}
