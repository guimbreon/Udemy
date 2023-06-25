public class CodingExercise12 {
    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean isIt;
        if (!summer){
            if(temperature >= 25 && temperature <= 35){
               isIt = true;
            }else{
                isIt = false;
            }
        }else if (summer){
            if(temperature >= 25 && temperature <= 45){
                isIt = true;
            }else {

                isIt = false;
            }
        }else {
            isIt = false;
        }
        return isIt;
    }
}
