package bo.usfx.carlosVictoria;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CollatzConjectureTests {

    @Test
    public void basicTestOne() {

        Assert.assertEquals(CollatzConjecture.hotpo(23), 15);

        Assert.assertEquals(CollatzConjecture.hotpo(5), 5);

        Assert.assertEquals(CollatzConjecture.hotpo(1), 0);

    }
}
