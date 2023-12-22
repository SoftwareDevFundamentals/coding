package bo.usfx.daviniaSalguero;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testTask2 {
    @Test
    public void test1() {
        int expectedSumResult = 5;
        Assert.assertEquals(Task2.hotpo(expectedSumResult), 5);
    }

    @Test
    public void test2() {
        int expectedSumResult = 6;
        Assert.assertEquals(Task2.hotpo(expectedSumResult), 8);
    }
}
