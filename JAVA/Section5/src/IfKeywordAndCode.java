public class IfKeywordAndCode {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 50;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000){
            System.out.println("Your score is smaller than 5000");
        } else if( score == 5000){
            System.out.println("Your score is equal to 5000");
        } else{
            System.out.println("The score is heigher than 5000");
        }

    }
}
