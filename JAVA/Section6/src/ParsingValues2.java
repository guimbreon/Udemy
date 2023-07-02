import java.util.Scanner;

public class ParsingValues2 {

    public static void main(String[] args) {
        int currentYear = 2022;
        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + " , You matter!");

        String dateOfBirth = System.console().readLine("What year were you born?");

        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What's Your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + " , You matter!");

        System.out.println("What year were you born?");
        String dateOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }
}
