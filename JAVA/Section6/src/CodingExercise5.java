public class CodingExercise5 {
    public static void main(String[] args) {
        boolean barking = false;
        int hourOfDay = 6;

        System.out.println(shouldWakeUp(barking,hourOfDay));


    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean TrueFalse;
        if (0 <= hourOfDay && hourOfDay <= 23){
            TrueFalse = (hourOfDay < 8 || hourOfDay > 22) && barking;
        }else {
            TrueFalse = false;
        }
    return TrueFalse;
    }

}
