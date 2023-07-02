public class CodingExercise22 {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int Divisor = 0;

        if (first >= 10 && second >= 10 ){
            for (int i = 1; i <= first;i++){
                if(first % i == 0 && second % i ==0){
                    Divisor = i;
                }
            }
            return Divisor;
        }

        return -1;
    }
}
