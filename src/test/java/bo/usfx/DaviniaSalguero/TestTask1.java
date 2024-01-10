package bo.usfx.DaviniaSalguero;

import bo.usfx.assignment04.TotalPoints;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTask1 {
    @Test
    public void test1() {

        Assert.assertEquals(TotalPoints.points(new String[]
                {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}), 30);
    }

    @Test
    public void test2() {

        Assert.assertEquals(TotalPoints.points(new String[]
                {"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"}), 10);
    }
}
