package bo.usfx.armandoTest;
import bo.usfx.armando.Collatz;
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
}
