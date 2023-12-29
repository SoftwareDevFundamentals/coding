package bo.usfx.brayanpoloTests.assignment_03Test;
//importamos la clase
import bo.usfx.brayanpolo.assignment_03.CollatzConjecture;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CollatzConjectureTest {
    @Test
    public void test1() {
        int inputValue = 6;
        int expectedValue = 8;
        Assert.assertEquals(CollatzConjecture.hotpo(inputValue), expectedValue);
    }
    @Test
    public void test2() {
        int inputValue = 23;
        int expectedValue = 15;
        Assert.assertEquals(CollatzConjecture.hotpo(inputValue), expectedValue);
    }
}
