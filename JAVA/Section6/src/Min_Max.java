import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isIt = true;
        String num = "0";
        int realNum = 0;

        int big = -2_147_483_648;

        int small = 2_147_483_647;

        while(isIt){
            try{
                System.out.println("Enter a number\n(If you want to exit, press any non-digit character and press enter!)");
                num = scanner.nextLine();
                realNum = Integer.parseInt(num);
                if(realNum < small){
                    small = realNum;
                }
                if (realNum > big){
                    big = realNum;
                }
            } catch (NumberFormatException badUserData){
                System.out.println("You entered a character so the program closed!");
                isIt = false;
            }
        }
        System.out.println("The smallest number entered was: " + small + " And the Biggest was: " + big);
    }
}
