public class HasTheSameTwoLastDigit {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(77,771,77));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        int newNumber1 = number1;
        int newNumber2 = number2;
        int newNumber3 = number3;

        int numberOfDigit = 0;

        int lastDigit = 9;
        if (number1 >= 10 && number1<= 1000 && number2 >= 10 && number2<= 1000 && number3 >= 10 && number3 <= 1000){

            if (number3 > 99) {
                while (number1 > 9) {
                    if (numberOfDigit == 0) {
                        lastDigit = number1 % 10;
                        number1 = number1 / 10;
                        numberOfDigit += 1;
                    } else {
                        lastDigit += (number1 % 10) * 10;
                        number1 = number1 / 10;
                    }
                }
                number1 = lastDigit;
                numberOfDigit = 0;

            }


            if (number2 > 99){
                while (number2 > 9) {
                    if (numberOfDigit == 0) {
                        lastDigit = number2 % 10;
                        number2 = number2 / 10;
                        numberOfDigit += 1;
                    } else {
                        lastDigit += (number2 % 10) * 10;
                        number2 = number2 / 10;
                    }
                }
                number2 = lastDigit;
                numberOfDigit = 0;
            }



            if (number2 > 99) {
                while (number3 > 9) {
                    if (numberOfDigit == 0) {
                        lastDigit = number3 % 10;
                        number3 = number3 / 10;
                        numberOfDigit += 1;
                    } else {
                        lastDigit += (number3 % 10) * 10;
                        number3 = number3 / 10;
                    }
                }
                number3 = lastDigit;
            }
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
