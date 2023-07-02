public class CodingExercise24 {
    public static void main(String[] args) {

        numberToWords(0);
    }

    public static void numberToWords(int number){
        int lastDigit = 0;

        number = reverse(number);

        if (number > 0){
            while(number != 0){
                //STEP 1
                lastDigit = number % 10;
                //STEP 2
                switch (lastDigit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                //STEP 3
                number = number / 10;
            }
        } else if (number == 0) {
            System.out.println("Zero");
        }else {
            System.out.println("Invalid Value");
        }
    }
    public static int reverse(int number){
        int newNumber = 0;
        if ( number >= 0){
            while (number > 9){
                newNumber += number % 10;
                number = number / 10;
                newNumber *= 10;

            }
            newNumber += number;
            return newNumber;
        }else{
            while (number < -9){
                newNumber += number % 10;
                number = number / 10;
                newNumber *= 10;

            }
            newNumber += number;
            return newNumber;

        }
    }

    public static int getDigitCount(int number){
        int Digits = 1;
        if(number >= 0){
            while (number > 9){
                number = number /10;
                Digits += 1;
            }
            return Digits;
        }

        return -1;
    }
}
