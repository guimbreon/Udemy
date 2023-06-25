public class MethodChallenge {
    public static void main(String[] args) {
        String playerName = "Tom";

        int playerScore = 1500;
        int playerPosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName,playerPosition);

        playerScore = 1000;
        playerPosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName,playerPosition);

        playerScore = 500;
        playerPosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName,playerPosition);

        playerScore = 100;
        playerPosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName,playerPosition);

        playerScore = 25;
        playerPosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName,playerPosition);

    }

    public static void displayHighScorePosition(String playerName,int  playerPosition) {

        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int playerPosition;
        if (playerScore >= 1000){
            playerPosition = 1;
        } else if (playerScore < 1000 && playerScore >=500){
            playerPosition = 2;
        } else if (playerScore < 500 && playerScore >=100){
            playerPosition = 3;
        } else {
            playerPosition = 4;
        }
        return playerPosition;
    }
}
