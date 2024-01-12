package bo.usfx.luisfernandovillca;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CollatzConjectureTests {
    @Test
    public void testVerifyMethodCollatzConjeture() {
        Assert.assertEquals(CollatzConjecture.collatz(1), 0);
        Assert.assertEquals(CollatzConjecture.collatz(5), 5);
        Assert.assertEquals(CollatzConjecture.collatz(6), 8);
        Assert.assertEquals(CollatzConjecture.collatz(23), 15);
    }
}
