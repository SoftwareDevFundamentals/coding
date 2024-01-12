package bo.usfx.simonchumaceroTests.assignment3;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import bo.usfx.simonchumacero.assignment3.Kata2;

/**
 * Test class for the Kata2 class.
 */
public final class Kata2Test {

  /**
   * Data provider for the tests.
   *
   * @return Two-dimensional array of objects with test data.
   */
  @DataProvider(name = "testData")
  public static Object[][] testData() {
    return new Object[][]{
        {6, 8},
        {5, 5},
        {1, 0}
    };
  }

  /**
   * Test for the hotpo method of the Kata2 class.
   *
   * @param inputNumber   Input number for the test.
   * @param expectedSteps Expected number of steps.
   */
  @Test(dataProvider = "testData")
  public void testHotpo(final int inputNumber, final int expectedSteps) {
    int actualSteps = Kata2.hotpo(inputNumber);
    Assert.assertEquals(actualSteps, expectedSteps);
  }
}
