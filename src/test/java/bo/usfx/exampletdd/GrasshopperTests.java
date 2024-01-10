package bo.usfx.exampletdd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GrasshopperTests {

    @Test
    public void basicTest() {
        int inputValue = 2;
        int expectedValue = 3;
        int actualValue = GrassHopper.summation(inputValue);
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void complexTest() {
        int inputValue = 8;
        int expectedValue = 36;
        int actualValue = GrassHopper.summation(inputValue);
        Assert.assertEquals(actualValue, expectedValue);
    }
}
