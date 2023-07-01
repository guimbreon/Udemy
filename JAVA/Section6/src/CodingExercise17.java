public class CodingExercise17 {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(123));
    }
    public  static  int sumFirstAndLastDigit(int number){
        int sum = 0;

        if (number < 0){
            return -1;
        }

        int i = 0;

        sum = number % 10;

        while (number > 9){
            number = number / 10;
        }
        sum += number;

        return  sum;
    }
}
