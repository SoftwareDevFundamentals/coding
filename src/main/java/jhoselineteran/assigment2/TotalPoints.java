package jhoselineteran.assigment2;

import java.util.logging.Logger;

/**
 * The TotalPoints class provides a method to
 * calculate the total points earned by a team in a series of games.
 */

public final class TotalPoints {
  private static final Logger LOGGER = Logger.getLogger(TotalPoints.class.getName());

  private TotalPoints() {
    // Constructor privado para ocultar el constructor predeterminado
  }

  /**
   * Calculates the total points earned by a team based on the results of a series of games.
   *
   * @param games An array of strings representing the scores of each game in the format "X:Y".
   * @return The total points earned by the team.
   */

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

  /**
   * The main method demonstrates the usage of the TotalPoints
   * class by calculating points earned in a predefined set of games.
   *
   * @param args Command line arguments (not used in this context).
   */

  public static void main(final String[] args) {
    final String[] games = {"3:1", "2:2", "0:1", "1:3", "4:0", "2:1", "1:1", "3:2", "0:0", "2:2"};
    final int pointsEarned = points(games);
    LOGGER.info(String.format("Our team earned a total of %d points.", pointsEarned));
  }
}
