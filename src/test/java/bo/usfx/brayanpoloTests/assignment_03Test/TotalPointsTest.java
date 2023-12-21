package bo.usfx.brayanpoloTests.assignment_03Test;
import bo.usfx.brayanpolo.assignment_03.CollatzConjecture;
import bo.usfx.brayanpolo.assignment_03.TotalPoints;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TotalPointsTest {

    @Test
    public void test1() {

        Assert.assertEquals(30, TotalPoints.points(new String[]
                {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));
    }
    @Test
    public void test2() {

        Assert.assertEquals(10, TotalPoints.points(new String[]
                {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}));
    }

}

