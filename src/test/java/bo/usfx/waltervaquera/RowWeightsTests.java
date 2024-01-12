package bo.usfx.waltervaquera;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RowWeightsTests {
    @Test
    public void tests() {
        Assert.assertEquals(RowWeights.rowWeights(new int[]{80}), new int[]{80, 0});
        Assert.assertEquals(RowWeights.rowWeights(new int[]{100, 50}), new int[]{100, 50});
        Assert.assertEquals(RowWeights.rowWeights(new int[]{50, 60, 70, 80}), new int[]{120, 140});
    }
}
