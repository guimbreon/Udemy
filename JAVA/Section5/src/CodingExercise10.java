public class CodingExercise10 {
    public static void main(String[] args) {
        printYearsAndDays(1051200);
        System.out.println(12 % 5);
    }
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else {
            long years = minutes / 525600;
            int days = (int) ((minutes % 525600) / 1440);
            System.out.println(minutes +" min = " + years + " y and " + days + " d");
        }
    }
}
