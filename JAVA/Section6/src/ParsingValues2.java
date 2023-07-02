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

        boolean validDOB = false;
        int age = 0;
        do{
            System.out.println("Enter your year of brith >=" +
                    (currentYear - 125) + "and <= " + (currentYear));
            try {
            age = checkData(currentYear,scanner.nextLine());
            validDOB = age < 0 ? false : true;
            }catch (NumberFormatException badUserData){
                System.out.println("Characters not allowed!!! Try again.");
            }
        }while (!validDOB);
        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear -125;

        if((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }
        return (currentYear -dob);
    }
}
