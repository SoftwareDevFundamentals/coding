package bo.usfx.jhoselineteran;



/**
 * The TotalPoints class provides a method to
 * calculate the total points earned by a team in a series of games.
 */
public final class TotalPoints {

  /**
   * Constant representing the points awarded for a win in a game.
   */

  private static final int WIN_POINTS = 3;

  private TotalPoints() {
  }
  /**
   * Calculates the total points earned by
   * a team based on the results of a series of games.
   *
   * @param games An array of strings representing
   *              the scores of each game in the format "X:Y".
   * @return The total points earned by the team.
   */

  public static int points(final String[] games) {
    int totalPoints = 0;

    for (final String game : games) {
      final String[] scores = game.split(":");
      final int ourScore = Integer.parseInt(scores[0]);
      final int opponentScore = Integer.parseInt(scores[1]);

      if (ourScore > opponentScore) {
        totalPoints += WIN_POINTS;  // Win
      } else if (ourScore == opponentScore) {
        totalPoints += 1;  // Tie
      }
      // No need to add points for a loss (total 0 points)
    }
    return totalPoints;
  }
}
