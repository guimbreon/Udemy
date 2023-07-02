public class CodingExercise25 {

    public static void main(String[] args) {
        System.out.println(canPack(2,0,9));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        int total = (bigCount * 5 + smallCount);

        if( goal == total){
            return true;
        } else if (goal < total) {
            while(goal > 4 & bigCount !=0){
                goal -= 5;
                bigCount -= 1;
            }
            System.out.println(smallCount + "a" + bigCount + "a" + goal);

            for (int i = 1; i <= smallCount; i++){
                if(goal != 0){
                    goal -=1;
                }else{
                    i = smallCount + 1;
                }
            }
            if ( goal == 0){
                return true;
            }
        }
        return false;
    }
}
