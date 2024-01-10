package bo.usfx.armandonuñez;

import org.testng.Assert;

import org.testng.annotations.Test;

public class TeamTest {
@Test
    public void basicTest() {
        int[] inputValue ={27,34,23,12};
        int[] expectedValue = {50,46};
        int[] actualValue = Team.rowWeights(inputValue);
        Assert.assertEquals(actualValue, expectedValue);
    }
}
