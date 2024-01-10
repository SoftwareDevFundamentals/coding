package bo.usfx.exampletdd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WellTests {

    @Test
    public void simpleTest() {
        Assert.assertEquals(Well.well(new String[]{"bad", "bad", "bad"}), "Fail!");
        Assert.assertEquals(Well.well(new String[] {"good", "bad", "bad", "bad", "bad"}), "Publish!");
        Assert.assertEquals(Well.well(new String[] {
                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}), "I smell a series!");
    }
}
