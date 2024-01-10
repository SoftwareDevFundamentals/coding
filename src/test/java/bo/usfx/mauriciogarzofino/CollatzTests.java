package bo.usfx.mauriciogarzofino;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CollatzTests {
    @Test
    void sampleTests() {
        Assert.assertEquals(CollatzC.hotpo(1), 0);
        Assert.assertEquals(CollatzC.hotpo(5), 5);
        Assert.assertEquals(CollatzC.hotpo(6), 8);
        Assert.assertEquals(CollatzC.hotpo(23), 15);
    }
}
