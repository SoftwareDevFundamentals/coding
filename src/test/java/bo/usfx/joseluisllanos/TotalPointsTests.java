package bo.usfx.joseluisllanos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TotalPointsTests {
    @Test
    public void test1() {
        String[] inputValue = {"2:0", "1:0", "2:1", "3:2", "1:0", "1:0", "2:1", "2:1", "3:2", "3:0"};
        int expectedValue = 30; 
        int currentValue = TotalPoints.points(inputValue);

        Assert.assertEquals(currentValue, expectedValue);
    }

    @Test
    public void test2() {
        String[] inputValue = {"2:0", "1:1", "0:1", "3:2", "1:1", "1:2", "2:1", "2:2", "1:3", "3:3"};
        int expectedValue = 13;
        int currentValue = TotalPoints.points(inputValue);

        Assert.assertEquals(currentValue, expectedValue);
    }

    @Test
    public void test3() {
        String[] inputValue = {"0:0", "1:1", "0:0", "2:2", "1:1", "1:1", "1:1", "2:2", "1:1", "3:3"};
        int expectedValue = 10;
        int currentValue = TotalPoints.points(inputValue);

        Assert.assertEquals(currentValue, expectedValue);
    }

    @Test
    public void test4() {
        String[] inputValue = {"0:1", "1:2", "0:1", "2:3", "1:3", "1:2", "1:3", "2:3", "1:2", "2:3"};
        int expectedValue = 0;
        int currentValue = TotalPoints.points(inputValue);

        Assert.assertEquals(currentValue, expectedValue);
    }
}
