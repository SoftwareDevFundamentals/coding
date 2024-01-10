package bo.usfx;

import java.util.stream.IntStream;

/**
 * The Example class provides a method for calculating the summation of numbers up to a given limit.
 */
public final class Example {

  private Example() {
    // Private constructor to prevent instantiation of the class.
  }

  /**
   * Calculates the summation of numbers from 1 to the specified limit (inclusive).
   *
   * @param n The upper limit for summation.
   * @return The summation of numbers from 1 to n.
   */
  public static int summation(final int n) {
    return IntStream.range(1, n + 1).sum();
  }
}

