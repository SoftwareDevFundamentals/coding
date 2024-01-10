package bo.usfx;

import bo.usfx.exampletdd.Example;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTests {
    @Test
    public void test1() {
        int expectedSumResult = 1;
        Assert.assertEquals(Example.summation(expectedSumResult), 1);
    }

    @Test
    public void test2() {
        int expectedSumResult = 8;
        Assert.assertEquals(Example.summation(expectedSumResult), 36);
    }
}
