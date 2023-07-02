import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String num = "0";
        for(int i = 1; i <= 5; i++){
            System.out.println("What is the " + i + "º number? ");
            num = scanner.nextLine();
            sum += Integer.parseInt(num);
        }
        System.out.println(sum);
    }

}
