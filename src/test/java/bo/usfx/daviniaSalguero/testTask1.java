package bo.usfx.daviniaSalguero;

import bo.usfx.Example;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testTask1 {
    @Test
    public void test1() {
        /*int expectedSumResult = 1;
        Assert.assertEquals(Example.summation(expectedSumResult), 1);*/
        Assert.assertEquals(Task1.points(new String[]
                {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}),30);
    }

    @Test
    public void test2() {
        /*int expectedSumResult = 8;
        Assert.assertEquals(Example.summation(expectedSumResult), 36);*/
        Assert.assertEquals(Task1.points(new String[]
                {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}),10);
    }
}
