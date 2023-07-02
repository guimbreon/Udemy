public class CodingExercise26 {
    public static void main(String[] args) {
    System.out.println(getLargestPrime(21));
    }
    public static int getLargestPrime (int number){
        int biggest = 0;

        int count = 0;
        if(number > 0){
            for(int i = 2; i <= number ; i++){
                if(number % i == 0 && i > biggest){
                    count = 0;
                    for(int j = 2; j < i ; j++) {
                        if( i % j == 0){
                            count +=1;
                        }
                    }
                    if(count == 0){
                        biggest = i;
                    }
                }
            }
            if (biggest > 0){
                return biggest;
            }else{
                return -1;
            }
        }

        return -1;
    }
}
