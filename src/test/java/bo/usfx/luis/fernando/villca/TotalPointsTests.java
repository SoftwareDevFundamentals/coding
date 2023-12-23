package bo.usfx.luis.fernando.villca;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TotalPointsTests {
    @Test
    public void testVerifyThatItReturnsTheResultWithAllTheGames() {
        String[] games = {"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"};
        Assert.assertEquals(15, TotalPoints.points(games));
    }

    @Test
    public void testVerifyAWonGame() {
        String[] game = {"3:1"};
        Assert.assertEquals(3, TotalPoints.points(game));
    }

    @Test
    public void testCheckALostGame() {
        String[] game = {"1:3"};
        Assert.assertEquals(0, TotalPoints.points(game));
    }

    @Test
    public void testCheckATiedGame() {
        String[] game = {"3:3"};
        Assert.assertEquals(1, TotalPoints.points(game));
    }
}
