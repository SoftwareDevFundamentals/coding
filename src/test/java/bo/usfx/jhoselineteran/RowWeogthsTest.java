package bo.usfx.jhoselineteran;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class RowWeogthsTest {

  @Test
  public void testRowWeightsWithEmptyArray() {
    int[] weights = {};
    int[] result = RowWeoghts.rowWeights(weights);
    Assert.assertEquals(result, new int[]{0, 0}, "For an empty array, both team weights should be 0.");
  }

  @Test
  public void testRowWeightsWithSingleElementArray() {
    int[] weights = {10};
    int[] result = RowWeoghts.rowWeights(weights);
    Assert.assertEquals(result, new int[]{10, 0},
    "For a single element array, team 1 weight should be the element, and team 2 weight should be 0.");
  }

  @Test
  public void testRowWeightsWithEvenNumberOfElements() {
    int[] weights = {10, 20, 30, 40};
    int[] result = RowWeoghts.rowWeights(weights);
    Assert.assertEquals(result, new int[]{40, 60},
   "Team1 weight must be the sum of elements at even indices team2 weight must be the sum of elements at odd indices");
  }

}
