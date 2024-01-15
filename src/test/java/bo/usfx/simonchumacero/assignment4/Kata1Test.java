package bo.usfx.simonchumacero.assignment4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Kata1Test {

  @Test
  public void testRowWeightsWithEvenLength() {
    int[] weights = {1, 2, 3, 4};
    int[] expectedTeamWeights = {4, 6};
    int[] actualTeamWeights = Kata1.rowWeights(weights);
    Assert.assertEquals(actualTeamWeights, expectedTeamWeights);
  }

  @Test
  public void testRowWeightsWithOddLength() {
    int[] weights = {1, 2, 3, 4, 5};
    int[] expectedTeamWeights = {9, 6};
    int[] actualTeamWeights = Kata1.rowWeights(weights);
    Assert.assertEquals(actualTeamWeights, expectedTeamWeights);
  }

  @Test
  public void testRowWeightsWithEmptyArray() {
    int[] weights = {};
    int[] expectedTeamWeights = {0, 0};
    int[] actualTeamWeights = Kata1.rowWeights(weights);
    Assert.assertEquals(actualTeamWeights, expectedTeamWeights);
  }

  @Test
  public void testRowWeightsWithSingleElement() {
    int[] weights = {7};
    int[] expectedTeamWeights = {7, 0};
    int[] actualTeamWeights = Kata1.rowWeights(weights);
    Assert.assertEquals(actualTeamWeights, expectedTeamWeights);
  }
}
