public class WhileLoopChallenge {
    public static void main(String[] args) {

        int i = 5;
        while (i <= 20 && i >= 5){
            System.out.println("The number " + i + (isEvenNumber(i) ? " is": " is NOT") + " a prime number.");
            i++;
        }
    }
    public static boolean isEvenNumber(int number){
        boolean isIt = false;

        if (number % 2 == 0){
            isIt = true;
        }

        return isIt;
    }
}
