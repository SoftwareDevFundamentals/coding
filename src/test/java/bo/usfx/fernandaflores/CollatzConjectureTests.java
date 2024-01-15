package bo.usfx.fernandaflores;

import org.testng.Assert;
import org.testng.annotations.Test;
public class CollatzConjectureTests {
    @Test
    public void firstTest() {
        Assert.assertEquals(CollatzConjecture.hotpo(23), 15);
    }

    @Test
    public void secondTest() {
        Assert.assertEquals(CollatzConjecture.hotpo(6), 8);
    }

    @Test
    public void thirdTest() {
        Assert.assertEquals(CollatzConjecture.hotpo(5), 5);
    }

    @Test
    public void fourthTest() {
        Assert.assertEquals(CollatzConjecture.hotpo(1), 0);
    }

}
