public class CodingExercise18 {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum (int number){
        int sum = 0;

        if (number < 0){
            return -1;
        }

        int digit = 0;

        while (number > 9){
            digit = number % 10;
            number = number / 10;
            if(digit % 2 == 0){
                sum += digit;
            }
        }
        if(number % 2 == 0){
            sum += number;

        }
        return sum;
    }
}
