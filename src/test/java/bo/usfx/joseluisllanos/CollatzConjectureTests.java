package bo.usfx.joseluisllanos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CollatzConjectureTests {
    @Test
    public void test1() {
        int inputValue = 1;
        int expectedValue = 0;
        int currentValue = CollatzConjecture.hotpo(inputValue);

        Assert.assertEquals(currentValue, expectedValue);
    }

    @Test
    public void test2() {
        int inputValue = 5;
        int expectedValue = 5;
        int currentValue = CollatzConjecture.hotpo(inputValue);

        Assert.assertEquals(currentValue, expectedValue);
    }

    @Test
    public void test3() {
        int inputValue = 6;
        int expectedValue = 8;
        int currentValue = CollatzConjecture.hotpo(inputValue);
        Assert.assertEquals(currentValue, expectedValue);
    }

    @Test
    public void test4() {
        int inputValue = 23;
        int expectedValue = 15;
        int currentValue = CollatzConjecture.hotpo(inputValue);
        Assert.assertEquals(currentValue, expectedValue);
    }
}
