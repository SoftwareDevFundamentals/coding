package bo.usfx.simonchumaceroTests.assignment4;

import bo.usfx.simonchumacero.assignment4.Kata1;

public final class Kata1Test {

  private Kata1Test() {
    // Private constructor to prevent instantiation of utility class
  }

  public static void main(final String[] args) {
    testRowWeights();
  }

  public static void testRowWeights() {
    // Arrange
    int[] weights1 = {1, 2, 3, 4, 5};
    int[] expected1 = {9, 6};

    int[] weights2 = {10, 20, 30, 40, 50, 60};
    int[] expected2 = {90, 90};

    int[] weights3 = {5, 10, 15, 20};
    int[] expected3 = {25, 30};

    // Act
    int[] result1 = Kata1.rowWeights(weights1);
    int[] result2 = Kata1.rowWeights(weights2);
    int[] result3 = Kata1.rowWeights(weights3);

    // Assert
    assertArrayEquals(expected1, result1);
    assertArrayEquals(expected2, result2);
    assertArrayEquals(expected3, result3);
  }

  private static void assertArrayEquals(final int[] expected, final int[] actual) {
    if (expected.length != actual.length) {
      throw new AssertionError("Arrays have different lengths");
    }

    for (int i = 0; i < expected.length; i++) {
      if (expected[i] != actual[i]) {
        throw new AssertionError("Arrays differ at " + i + ". Expected: " + expected[i] + ",but was: " + actual[i]);
      }
    }

    System.out.println("Arrays are equal");
  }
}
