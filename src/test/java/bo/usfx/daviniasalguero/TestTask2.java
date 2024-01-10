package bo.usfx.daviniasalguero;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTask2 {
    @Test
    public void test1() {
        int expectedSumResult = 5;
        Assert.assertEquals(CollatzC.hotpo(expectedSumResult), 5);
    }

    @Test
    public void test2() {
        int expectedSumResult = 6;
        Assert.assertEquals(CollatzC.hotpo(expectedSumResult), 8);
    }
}
