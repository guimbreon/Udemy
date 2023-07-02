public class CodingExercise20 {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(71,771,77));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        int lastNumber1 = number1;
        int lastNumber2 = number2;
        int lastNumber3 = number3;

        int numberOfDigit = 0;

        int lastDigit = 9;
        if (number1 >= 10 && number1<= 1000 && number2 >= 10 && number2<= 1000 && number3 >= 10 && number3 <= 1000){
            number1 = number1 % 10;

            number2 = number2 % 10;

            number3 = number3 % 10;

            if ((number1 == number2) || (number1 == number3) || (number2 == number3)){
                return true;
            }
        }

        return false;
    }



    public  static boolean isValid (int number4){
        return (number4 <= 1000 && number4 >= 10);
    }
}
