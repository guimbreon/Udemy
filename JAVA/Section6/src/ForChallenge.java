public class ForChallenge {
    public static void main(String[] args) {
        int max = 11;
        int total = 0;
        for(int i = 1; i <=max ; i++){
            if (isPrime(i)){
                total +=1;
            }
        }
        System.out.println(total);
    }
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for(int divisor = 2;divisor < wholeNumber;divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
    }
