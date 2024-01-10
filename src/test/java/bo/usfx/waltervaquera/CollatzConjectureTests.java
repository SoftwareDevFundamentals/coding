package bo.usfx.waltervaquera;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CollatzConjectureTests {
    @Test
    public void tests() {
        Assert.assertEquals(CollatzConjecture.steps(1), 0);
        Assert.assertEquals(CollatzConjecture.steps(5), 5);
        Assert.assertEquals(CollatzConjecture.steps(6), 8);
        Assert.assertEquals(CollatzConjecture.steps(23), 15);
    }
}
