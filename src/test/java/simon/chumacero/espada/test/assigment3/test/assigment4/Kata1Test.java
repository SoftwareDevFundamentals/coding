package simon.chumacero.espada.test.assigment3.test.assigment4;

import org.junit.Assert;
import org.junit.Test;
import simon.chumacero.espada.assigment4.Kata1;

public class Kata1Test {

  @Test
  public void testRowWeights() {
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
    Assert.assertArrayEquals(expected1, result1);
    Assert.assertArrayEquals(expected2, result2);
    Assert.assertArrayEquals(expected3, result3);
  }
}
