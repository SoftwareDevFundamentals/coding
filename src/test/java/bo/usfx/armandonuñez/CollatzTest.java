package bo.usfx.armandonuñez;

import org.testng.Assert;
import org.testng.annotations.Test;


import bo.usfx.exampletdd.GrassHopper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CollatzTest {
    @Test
    public void basicTest() {
        int inputValue = 5;
        int expectedValue = 5;
        int actualValue = Collatz.hotpo(inputValue);
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void complexTest() {
        int inputValue = 23;
        int expectedValue = 15;
        int actualValue = Collatz.hotpo(inputValue);
        Assert.assertEquals(actualValue, expectedValue);
    }
}
