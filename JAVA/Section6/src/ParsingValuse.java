public class ParsingValuse {
    public static void main(String[] args) {
        int currentYear = 2022;
        String usersDateOfBirth = "1999";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));

    String usersAgeWithPartialYear = "22.5";
    double ageWithParticalYear = Double.parseDouble(usersAgeWithPartialYear);
    System.out.println("The user says he is : " + ageWithParticalYear + "yo.");

    }
}
