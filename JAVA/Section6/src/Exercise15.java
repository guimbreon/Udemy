public class Exercise15 {
    public static void main(String[] args) {
        System.out.println(sumOdd(12,1));
    }
    public static boolean isOdd(int number){
        if (number > 0 && number % 2 == 0){
                return true;
        }else{
            return false;
        }
    }
    public static int sumOdd(int start, int end){
        int Summ = 0;
        if (start >= end && start > 0 && end > 0){
            return -1;
        }
        for(int i = start; i <= end; i++){
            System.out.println(i);
           if(isOdd(i)){
               Summ += i;
           }
        }
        return Summ;
    }
}
