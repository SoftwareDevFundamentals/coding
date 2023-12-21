package bo.usfx.exampletdd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WellTests {

    @Test
    public void simpleTest() {
        Assert.assertEquals("Fail!", Well.well(new String[]{"bad", "bad", "bad"}));
        Assert.assertEquals("Publish!", Well.well(new String[] {"good", "bad", "bad", "bad", "bad"}));
        Assert.assertEquals("I smell a series!", Well.well(new String[] {
                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }
}
