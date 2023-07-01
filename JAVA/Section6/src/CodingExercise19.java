public class CodingExercise19 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,13));
    }

    public  static boolean hasSharedDigit(int number1, int number2){
        boolean isIt = false;
        int digit1 = 0;
        int digit2 = 0;

        int newNumber1 = number1;
        int newNumber2 = number2;

        if (number1 >= 10 && number1 <= 99 && number2 >= 10 && number2 <= 99){

            while ( number1 > 9 ){
                digit1 = number1 % 10;
                number1 = number1 / 10;
                while (number2 > 9){
                    digit2 = number2 % 10;
                    number2 = number2 /10;
                    if (digit1 == digit2) {
                        return true;
                    }
                }
                if (digit1 == number2){
                    return true;
                }
                if (number1 > 99){
                    number2 = newNumber2;
                }
            }
            if (number1 == number2){
                return true;
            }

        }

        return isIt;
    }
}
