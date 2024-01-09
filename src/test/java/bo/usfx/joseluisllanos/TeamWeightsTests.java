package bo.usfx.joseluisllanos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamWeightsTests {
    @Test
    public void test1(){
        int[] inputValue = {80};
        int[] expectedValue = {80, 0};
        int[] currentValue = TeamWeights.rowWeights(inputValue);

        Assert.assertEquals(currentValue, expectedValue);
    }
    @Test
    public void test2(){
        int[] inputValue = {10, 10, 10, 10};
        int[] expectedValue = {20, 20};
        int[] currentValue = TeamWeights.rowWeights(inputValue);

        Assert.assertEquals(currentValue, expectedValue);
    }

    @Test
    public void test3(){
        int[] inputValue = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] expectedValue = {250, 200};
        int[] currentValue = TeamWeights.rowWeights(inputValue);

        Assert.assertEquals(currentValue, expectedValue);
    }
}
