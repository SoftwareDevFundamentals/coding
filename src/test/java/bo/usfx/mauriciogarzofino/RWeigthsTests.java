package bo.usfx.mauriciogarzofino;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RWeigthsTests {
    @Test
    public void basicTest() {
        Assert.assertEquals(RowWeights.rowWeights(new int[]{100, 50}), new int[]{100, 50});
        Assert.assertEquals(RowWeights.rowWeights(new int[]{100, 51, 50, 100}), new int[]{150, 151});
        Assert.assertEquals(RowWeights.rowWeights(new int[]{39, 84, 74, 18, 59, 72, 35, 61}), new int[]{207, 235});

    }
}
