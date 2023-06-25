
public class CodingExercise2 {
    public static void main(String[] args) {
        double kilometersPerHour = 75;
        System.out.println(toMilesPerHour(kilometersPerHour));
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour;

        double miles = 0.6213712D;
        if (kilometersPerHour < 0 ){
            milesPerHour = -1L;
        }else{
            milesPerHour = Math.round(kilometersPerHour * miles);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

        return milesPerHour;
    }
}
