package simon.chumacero.espada.test.assigment3.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simon.chumacero.espada.assigment3.Kata2;

public class Kata2Test {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
            {6, 8},
            {5, 5},
            {1, 0}
        };
    }

    @Test(dataProvider = "testData")
    public void testHotpo(int inputNumber, int expectedSteps) {
        int actualSteps = Kata2.hotpo(inputNumber);
        Assert.assertEquals(actualSteps, expectedSteps);
    }
}
