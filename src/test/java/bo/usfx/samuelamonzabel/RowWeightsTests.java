package bo.usfx.samuelamonzabel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RowWeightsTests {
    @Test
    public void test() {
        Assert.assertEquals(RowWeights.rowWeights(new int[]{80}), new int[]{80, 0});
        Assert.assertEquals(RowWeights.rowWeights(new int[]{70, 58, 75, 34, 91}), new int[]{236, 92});
        Assert.assertEquals(RowWeights.rowWeights(new int[]{100, 51, 50, 100}), new int[]{150, 151});

    }
}
