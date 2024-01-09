package bo.usfx.luis.fernando.villca;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RowWeightsTests {
    @Test
    public void basicTests() {
        Assert.assertEquals(new int[]{80, 0}, RowWeights.rowWeights(new int[]{80}));
        Assert.assertEquals(new int[]{100, 50}, RowWeights.rowWeights(new int[]{100, 50}));
        Assert.assertEquals(new int[]{120, 140}, RowWeights.rowWeights(new int[]{50, 60, 70, 80}));
    }

    @Test
    public void oddVectorLength() {
        Assert.assertEquals(new int[]{62, 27}, RowWeights.rowWeights(new int[]{13, 27, 49}));
        Assert.assertEquals(new int[]{236, 92}, RowWeights.rowWeights(new int[]{70, 58, 75, 34, 91}));
        Assert.assertEquals(new int[]{211, 164}, RowWeights.rowWeights(new int[]{29, 83, 67, 53, 19, 28, 96}));
    }

    @Test
    public void evenVectorLength() {
        Assert.assertEquals(new int[]{100, 50}, RowWeights.rowWeights(new int[]{100, 50}));
        Assert.assertEquals(new int[]{150, 151}, RowWeights.rowWeights(new int[]{100, 51, 50, 100}));
        Assert.assertEquals(new int[]{207, 235}, RowWeights.rowWeights(new int[]{39, 84, 74, 18, 59, 72, 35, 61}));
    }
}
