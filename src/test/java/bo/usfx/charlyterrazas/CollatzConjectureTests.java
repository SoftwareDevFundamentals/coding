package bo.usfx.charlyterrazas;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CollatzConjectureTests {

    @Test
    public void tests() {
        Assert.assertEquals(CollatzConjecture.hotpo(1), 0);
        Assert.assertEquals(CollatzConjecture.hotpo(5), 5);
        Assert.assertEquals(CollatzConjecture.hotpo(6), 8);
        Assert.assertEquals(CollatzConjecture.hotpo(23), 15);
    }
}
