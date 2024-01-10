package bo.usfx.DaviniaSalguero;

import bo.usfx.assignment04.CollatzC;
import bo.usfx.assignment04.RowWeights;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTask3 {
    @Test
    public void test1() {
        Assert.assertEquals(RowWeights.rowWeights(new int[]{50, 60, 70, 80}), new int[]{120, 140});
    }

    @Test
    public void test2() {
        Assert.assertEquals(RowWeights.rowWeights(new int[]{13, 27, 49}), new int[]{62, 27});
    }
}
