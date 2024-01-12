package bo.usfx.simonchumacero.assignment4;

public final class Kata1 {
  private Kata1() {
  }

  /**
   * Function that receives an array of integers and classifies them.
   *
   * @param weights array of integers
   * @return array of sorted integers
   */
  public static int[] rowWeights(final int[] weights) {
    int team1Weight = 0;
    int team2Weight = 0;

    for (int i = 0; i < weights.length; i++) {
      // If the index is even, add to team 1
      if (i % 2 == 0) {
        team1Weight += weights[i];
        // If the index is odd, add to team 2
      } else {
        team2Weight += weights[i];
      }
    }

    return new int[]{team1Weight, team2Weight};
  }
}
