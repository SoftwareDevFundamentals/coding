package bo.usfx.luisfernandovillca;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TotalPointsTests {
    @Test
    public void testVerifyThatItReturnsTheResultWithAllTheGames() {
        String[] games = {"1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4"};
        Assert.assertEquals(TotalPoints.points(games), 15);
    }

    @Test
    public void testVerifyAWonGame() {
        String[] game = {"3:1"};
        Assert.assertEquals(TotalPoints.points(game), 3);
    }

    @Test
    public void testCheckALostGame() {
        String[] game = {"1:3"};
        Assert.assertEquals(TotalPoints.points(game), 0);
    }

    @Test
    public void testCheckATiedGame() {
        String[] game = {"3:3"};
        Assert.assertEquals(TotalPoints.points(game), 1);
    }
}
