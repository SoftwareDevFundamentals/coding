package bo.usfx.luisfernandovillca;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RowWeightsTests {
    @Test
    public void basicTests() {
        Assert.assertEquals(RowWeights.rowWeights(new int[]{80}), new int[]{80, 0});
        Assert.assertEquals(RowWeights.rowWeights(new int[]{100, 50}), new int[]{100, 50});
        Assert.assertEquals(RowWeights.rowWeights(new int[]{50, 60, 70, 80}), new int[]{120, 140});
    }

    @Test
    public void oddVectorLength() {
        Assert.assertEquals(RowWeights.rowWeights(new int[]{13, 27, 49}), new int[]{62, 27});
        Assert.assertEquals(RowWeights.rowWeights(new int[]{70, 58, 75, 34, 91}), new int[]{236, 92});
        Assert.assertEquals(RowWeights.rowWeights(new int[]{29, 83, 67, 53, 19, 28, 96}), new int[]{211, 164});
    }

    @Test
    public void evenVectorLength() {
        Assert.assertEquals(RowWeights.rowWeights(new int[]{100, 50}), new int[]{100, 50});
        Assert.assertEquals(RowWeights.rowWeights(new int[]{100, 51, 50, 100}), new int[]{150, 151});
        Assert.assertEquals(RowWeights.rowWeights(new int[]{39, 84, 74, 18, 59, 72, 35, 61}), new int[]{207, 235});
    }
}
