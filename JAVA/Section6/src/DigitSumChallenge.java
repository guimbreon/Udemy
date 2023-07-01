public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigits(74));
    }
    public static int sumDigits(int number){
        int total = 0;

        if (number > 0) {
            while(number > 9){
                System.out.println("a");
                total += (number % 10);
                number = number / 10;
            }
            total += number;
        }else{
            return -1;
        }

        return total;
    }
}
