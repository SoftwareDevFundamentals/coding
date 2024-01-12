package bo.usfx.simonchumaceroTests.assignment3;

import org.testng.Assert;
import org.testng.annotations.Test;
import bo.usfx.simonchumacero.assignment3.Kata1;

public class Kata1Test {

  @Test
  public void testPointsWithWins() {
    String[] games = {"3:0", "2:1", "4:2"};
    int expectedPoints = 9;
    int actualPoints = Kata1.points(games);
    Assert.assertEquals(actualPoints, expectedPoints);
  }

  @Test
  public void testPointsWithTies() {
    String[] games = {"1:1", "0:0", "2:2"};
    int expectedPoints = 3;
    int actualPoints = Kata1.points(games);
    Assert.assertEquals(actualPoints, expectedPoints);
  }

  @Test
  public void testPointsWithNoGames() {
    String[] games = {};
    int expectedPoints = 0;
    int actualPoints = Kata1.points(games);
    Assert.assertEquals(actualPoints, expectedPoints);
  }
}
