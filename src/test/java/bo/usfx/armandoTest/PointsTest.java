package bo.usfx.armandoTest;
import bo.usfx.armando.Points;
import org.testng.Assert;
import org.testng.annotations.Test;
public class PointsTest {
    @Test
    public void test1() {
        String[] inputValue =new String[] {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
        int expectedValue = 30;
        Assert.assertEquals(Points.points(inputValue), expectedValue);
    }
}
