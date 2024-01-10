package bo.usfx.exampletdd;

/**
 * The GrassHopper class provides a method for calculating
 * the summation of numbers up to a given limit.
 */

public final class GrassHopper {

  private GrassHopper() {

  }

  /**
   *Calculates the summation of numbers
   *from 1 to the specified limit (inclusive).
   *
   * @param n The upper limit for summation.
   * @return The summation of numbers from 1 to n.
   */

  public static int summation(final int n) {
    int sumaTotal = 0;
    for (int i = 1; i <= n; i++) {
      sumaTotal += i;
    }

    return sumaTotal;
  }
}
