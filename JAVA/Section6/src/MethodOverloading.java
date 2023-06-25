public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("tim",500);
        System.out.println("New score is: " + newScore);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + "s cored " + score + " points");
        return  score * 1000;
    }

    public static int calculateScsore(String playerName, int score){
        System.out.println("Player " + playerName + "s cored " + score + " points");
        return  score * 1000;
    }
}
