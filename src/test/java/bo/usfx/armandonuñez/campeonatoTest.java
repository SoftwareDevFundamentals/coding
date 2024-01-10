package bo.usfx.armandonuñez;


import org.testng.Assert;
import org.testng.annotations.Test;

public class campeonatoTest {
    @Test
    public void basicTest() {
        String[] inputValue = {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"};
        int expectedValue = 10;
        int actualValue = campeonato.points(inputValue);
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void complexTest() {
        String[] inputValue = {"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"};
        int expectedValue = 15;
        int actualValue = campeonato.points(inputValue);
        Assert.assertEquals(actualValue, expectedValue);
    }
}
