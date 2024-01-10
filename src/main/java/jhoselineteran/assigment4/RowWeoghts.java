package jhoselineteran.assigment4;

/**
 * This class provides a solution for calculating row weights.
 */
public final class RowWeoghts {

  private RowWeoghts() {
    // Private constructor to hide the implicit public one
  }

  /**
   * Calculate the total weights for each team.
   *
   * @param weights An array of positive
   *                integers representing the weights of the people.
   *@return An array of two integers, where
   *         the first one is the total weight of team 1,
   *         and the second one is the total weight of team 2.
   */
  public static int[] rowWeights(final int[] weights) {
    int team1 = 0;
    int team2 = 0;

    for (int i = 0; i < weights.length; i++) {
      if (i % 2 == 0) {
        // Assign to team 1
        team1 += weights[i];
      } else {
        // Assign to team 2
        team2 += weights[i];
      }
    }

    return new int[]{team1, team2};
  }
}




