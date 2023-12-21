package bo.usfx.brayanpoloTests.assignment_03Test;
//importamos la clase
import bo.usfx.brayanpolo.assignment_03.CollatzConjecture;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CollatzConjectureTest {

    @Test
    public void test1() {
        int expectedSumResult = 6;
        Assert.assertEquals(CollatzConjecture.hotpo(expectedSumResult), 8);
    }
    @Test
    public void test2() {
        int expectedSumResult = 23;
        Assert.assertEquals(CollatzConjecture.hotpo(expectedSumResult), 15);
    }
}
