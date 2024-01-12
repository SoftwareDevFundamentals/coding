package bo.usfx.fernanda_flores;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TotalPointsTests {
    @Test
    public void firstTest() {
        Assert.assertEquals(TotalPoints.points(new String[]
                {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}), 30);
    }

    @Test
    public void secondTest() {
        Assert.assertEquals(TotalPoints.points(new String[]
                {"0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"}), 0);
    }

    @Test
    public void thirdTest() {
        Assert.assertEquals(TotalPoints.points(new String[]
                {"1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4"}), 12);
    }

    @Test
    public void fourthTest() {
        Assert.assertEquals(TotalPoints.points(new String[]
                {"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"}), 10);
    }

    @Test
    public void fifthTest() {
        Assert.assertEquals(TotalPoints.points(new String[]
                {"1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4"}), 15);
    }
}
