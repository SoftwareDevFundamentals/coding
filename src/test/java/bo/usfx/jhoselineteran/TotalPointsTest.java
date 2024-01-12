package bo.usfx.jhoselineteran;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TotalPointsTest {

  @Test
  public void test1() {
    String[] games = {"3:1", "4:0", "2:1", "3:2"};
    int result = TotalPoints.points(games);
    Assert.assertEquals(result, 12, "Total points for winning games should be 12.");
  }

  @Test
  public void test2() {
    String[] games = {"2:2", "1:1", "0:0", "2:2"};
    int result = TotalPoints.points(games);
    Assert.assertEquals(result, 4, "Total points for tied games should be 4.");
  }

}
