public class MainChallenge {
    public static void main(String[] args) {

        int finalScore = calculateScore(true,800,5,100);

        System.out.println("Yours final score was " + finalScore);

        System.out.println("The next highScore is:" +
                calculateScore(true,10_000,8,200));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if(gameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return  finalScore;
    }
}
