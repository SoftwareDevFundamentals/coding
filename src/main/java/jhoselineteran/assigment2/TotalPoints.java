package jhoselineteran.assigment2;

import java.util.logging.Logger;

public final class TotalPoints {
  private static final Logger LOGGER = Logger.getLogger(TotalPoints.class.getName());

  private TotalPoints() {
    // Constructor privado para ocultar el constructor predeterminado
  }

  public static int points(final String[] games) {
    int totalPoints = 0;

    for (final String game : games) {
      final String[] scores = game.split(":");
      final int ourScore = Integer.parseInt(scores[0]);
      final int opponentScore = Integer.parseInt(scores[1]);

      if (ourScore > opponentScore) {
        totalPoints += 3;  // Win
      } else if (ourScore == opponentScore) {
        totalPoints += 1;  // Tie
      }
      // No need to add points for a loss (0 points)
    }

    return totalPoints;
  }

  public static void main(final String[] args) {
    final String[] games = {"3:1", "2:2", "0:1", "1:3", "4:0", "2:1", "1:1", "3:2", "0:0", "2:2"};
    final int pointsEarned = points(games);
    LOGGER.info(String.format("Our team earned a total of %d points.", pointsEarned));
  }
}
