package bo.usfx.simonchumacero.assignment3;

public final class Kata2 {

  /**
   * Constante de la conjetura Collatz.
   */
  private static final int CONSTANT_3 = 3;


  private Kata2() {

  }


  public static int hotpo(final int n) {
    int steps = 0;
    int currentNumber = n;

    while (currentNumber != 1) {
      if (currentNumber % 2 == 0) {
        currentNumber /= 2;
      } else {
        currentNumber = CONSTANT_3 * currentNumber + 1;
      }
      steps++;
    }

    return steps;
  }
}

