public class CodingExercise16 {
    public static void main(String[] args) {
        int number = 10201;
        System.out.println("The number " + number + (isPalindrome(number) ? " is" : " is NOT") + " a palindrome.");

    }
    public static boolean isPalindrome(int number) {
        boolean isIt = false;
        int reverse = 0;
        int realNumber = number;
        while (number > 9) {
            reverse += number % 10;
            number = number / 10;
            reverse = reverse * 10;
        }
        reverse += number;

        if (realNumber == reverse){
            isIt = true;
        }

        return isIt;
    }
}
