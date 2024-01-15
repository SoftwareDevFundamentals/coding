package bo.usfx.daviniasalguero.assignment04;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTask1 {
    @Test
    public void test1() {
        Assert.assertEquals(RowWeight.rowWeights(new int[]{13, 27, 49}), new int[]{62, 27});
    }

    @Test
    public void test2() {
        Assert.assertEquals(RowWeight.rowWeights(new int[]{50, 60, 70, 80}), new int[]{120, 140});
    }
}
