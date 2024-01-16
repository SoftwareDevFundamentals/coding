package bo.usfx.brayanpoloTests;

import bo.usfx.brayanpolo.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SolutionTest {
    @Test
    public void test1() {

        int[] inputValue1 = new int[] {80};
        int[] inputValue2 = new int[] {100, 50};
        int[] inputValue3 = new int[] {50, 60, 70, 80};

        int[] expectedValue1 = new int[] {80, 0};
        int[] expectedValue2 = new int[] {100, 50};
        int[] expectedValue3 = new int[] {120, 140};

        Assert.assertEquals(Solution.rowWeights(inputValue1), expectedValue1);
        Assert.assertEquals(Solution.rowWeights(inputValue2), expectedValue2);
        Assert.assertEquals(Solution.rowWeights(inputValue3), expectedValue3);
    }

    @Test
    public void test2() {

        int[] inputValue1 = new int[] {13, 27, 49};
        int[] inputValue2 = new int[] {70, 58, 75, 34, 91};
        int[] inputValue3 = new int[] {29, 83, 67, 53, 19, 28, 96};

        int[] expectedValue1 = new int[] {62, 27};
        int[] expectedValue2 = new int[] {236, 92};
        int[] expectedValue3 = new int[] {211, 164};

        Assert.assertEquals(Solution.rowWeights(inputValue1), expectedValue1);
        Assert.assertEquals(Solution.rowWeights(inputValue2), expectedValue2);
        Assert.assertEquals(Solution.rowWeights(inputValue3), expectedValue3);
    }

}
