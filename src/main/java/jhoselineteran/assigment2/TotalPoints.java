package jhoselineteran.assigment2;

import java.util.logging.Logger;

public class TotalPoints {

    private static final Logger LOGGER = Logger.getLogger(TotalPoints.class.getName());

    public static int points(String[] games) {
        int totalPoints = 0;

        for (String game : games) {
            String[] scores = game.split(":");
            int ourScore = Integer.parseInt(scores[0]);
            int opponentScore = Integer.parseInt(scores[1]);

            if (ourScore > opponentScore) {
                totalPoints += 3;  // Win
            } else if (ourScore == opponentScore) {
                totalPoints += 1;  // Tie
            }
            // No need to add points for a loss (0 points)
        }

        return totalPoints;
    }

    public static void main(String[] args) {
        String[] games = {"3:1", "2:2", "0:1", "1:3", "4:0", "2:1", "1:1", "3:2", "0:0", "2:2"};
        int pointsEarned = points(games);
        LOGGER.info("Our team earned a total of " + pointsEarned + " points.");
    }
}
