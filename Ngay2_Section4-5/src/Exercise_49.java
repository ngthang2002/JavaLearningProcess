public class Exercise_49 {
    public static void main(String[] args) {
        displayHightScorePosition("Tim", calculateHighScorePosition(110));
    }

    public static void displayHightScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        return (playerScore >= 1000) ? 1 :
                    (playerScore >= 500) ? 2 :
                        (playerScore >= 100) ? 3 : 4;
    }
}