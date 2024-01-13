package bo.usfx.charlyterrazas;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RowWeightsTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {new int[]{80}, new int[]{80, 0}},
                {new int[]{100, 50}, new int[]{100, 50}},
                {new int[]{50, 60, 70, 80}, new int[]{120, 140}},
                {new int[]{13, 27, 49}, new int[]{62, 27}},
                {new int[]{70, 58, 75, 34, 91}, new int[]{236, 92}},
                {new int[]{29, 83, 67, 53, 19, 28, 96}, new int[]{211, 164}},
                {new int[]{100, 51, 50, 100}, new int[]{150, 151}},
                {new int[]{39, 84, 74, 18, 59, 72, 35, 61}, new int[]{207, 235}}
        };
    }

    @Test(dataProvider = "testData")
    public void testCalculateTeamWeights(int[] weights, int[] expected) {
        Assert.assertEquals(RowWeights.calculateTeamWeights(weights), expected);
    }
}
