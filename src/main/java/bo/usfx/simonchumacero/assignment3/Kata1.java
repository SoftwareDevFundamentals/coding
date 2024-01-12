package bo.usfx.simonchumacero.assignment3;

public final class Kata1 {
  /**
   * Points awarded for a victory.
   */
  private static final int WIN_POINTS = 3;

  /**
   * Points awarded for a tie.
   */
  private static final int TIE_POINTS = 1;

  private Kata1() {
  }

  /**
   * Receives a String with the score of the games.
   *
   * @param games a string with the score or result of the games
   * @return an integer with the total points result
   */
  public static int points(final String[] games) {
    int totalPoints = 0;

    for (String result : games) {
      int ourScore = Character.getNumericValue(result.charAt(0));
      int opponentScore = Character.getNumericValue(result.charAt(2));

      if (ourScore > opponentScore) {
        // Win
        totalPoints += WIN_POINTS;
      } else if (ourScore == opponentScore) {
        // Tie
        totalPoints += TIE_POINTS;
      }
    }
    return totalPoints;
  }
}
