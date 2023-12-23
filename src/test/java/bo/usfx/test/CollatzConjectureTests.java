package bo.usfx.test;
import bo.usfx.assignment3.TotalPoints;
import bo.usfx.assignment3.CollatzConjecture;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CollatzConjectureTests {
    @Test
    public void test1() {
        int inputValue = 6;
        int expectedValue = 8;
        Assert.assertEquals(CollatzConjecture.hotpo(inputValue), expectedValue);
    }
    @Test
    public void test2() {
        int inputValue = 23;
        int expectedValue = 15;
        Assert.assertEquals(CollatzConjecture.hotpo(inputValue), expectedValue);
    }
}
