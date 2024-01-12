package bo.usfx.carlosvictoria;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TotalPointsTests {

    @Test
    public void basicTextOne() {

        Assert.assertEquals(TotalPoints.points(new String[]
                {"1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4"}), 15);

        Assert.assertEquals(TotalPoints.points(new String[]
                {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}), 30);

        Assert.assertEquals(TotalPoints.points(new String[]
                {"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"}), 10);

        Assert.assertEquals(TotalPoints.points(new String[]
                {"0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"}), 0);
    }
}
