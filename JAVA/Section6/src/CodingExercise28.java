import java.util.Scanner;

public class CodingExercise28 {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        boolean isIt = true;
        String num = "";
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        while (isIt){
            try{
                System.out.println("Enter a number\n(If you want to exit, press any non-digit character and press enter!)");
                num = scanner.nextLine();
                sum += Integer.parseInt(num);
                count += 1;

            } catch (NumberFormatException badUserData){
                System.out.println("You entered a character so the program closed!");
                isIt = false;
            }
        }
        long avg = sum / count;
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
