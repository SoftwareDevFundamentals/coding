package bo.usfx.exampletdd;

/**
 * The Well class provides a method for evaluating
 * a set of ideas and determining the overall outcome.
 */

public final class Well {

  private Well() {

  }

  /**
   * Determines the outcome based on the number of "good" ideas in the provided array.
   *
   * @param x An array of ideas represented as strings.
   * @return The overall outcome based on the number of "good" ideas.
   */

  public static String well(final String[] x) {
    int buenasIdeas = 0;

    for (String idea : x) {
      if (idea.equals("good")) {
        buenasIdeas++;
      }
    }

    if (buenasIdeas == 1 || buenasIdeas == 2) {
      return "Publish!";
    } else if (buenasIdeas > 2) {
      return "I smell a series!";
    } else {
      return "Fail!";
    }
  }
}
