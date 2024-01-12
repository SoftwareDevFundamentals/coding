package bo.usfx.simonchumacero.assignment2;

public final class Kata1 {
  /**
   * From this quantity onward, it is considered a series.
   */
  private static final int SMELL_SERIE = 3;
  /**
   * With a quantity between 1 and 2, it is not considered a series.
   */
  private static final int MIN_NUMBER = 1;
  /**
   * With a quantity between 1 and 2, it is not considered a series.
   */
  private static final int MAX_NUMBER = 2;

  private Kata1() {

  }

  /**
   * Method that checks if a given series is correct to be published.
   *
   * @param x Receives a list of strings with a series
   * @return Returns a string with the classification of the series
   */
  public static String well(final String[] x) {

    int count = 0;
    for (String word : x) {
      if ("good".equals(word)) {
        count = count + 1;
      }
    }
    if (count >= SMELL_SERIE) {
      return "I smell a series!";
    }
    if (count == MIN_NUMBER || count == MAX_NUMBER) {
      return "Publish!";
    }

    return "Fail!";
  }
}
