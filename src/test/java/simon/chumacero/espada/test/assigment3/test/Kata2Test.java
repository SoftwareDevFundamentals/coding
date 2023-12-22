package simon.chumacero.espada.test.assigment3.test;


import org.testng.Assert;
import org.testng.annotations.Test;
import simon.chumacero.espada.assigment3.Kata2;

public class Kata2Test {

    @Test
    public void testHotpoWithEvenNumber() {
        int inputNumber = 6;
        int expectedSteps = 8;
        int actualSteps = Kata2.hotpo(inputNumber);
        Assert.assertEquals(actualSteps, expectedSteps);
    }

    @Test
    public void testHotpoWithOddNumber() {
        int inputNumber = 5;
        int expectedSteps = 5;
        int actualSteps = Kata2.hotpo(inputNumber);
        Assert.assertEquals(actualSteps, expectedSteps);
    }

    @Test
    public void testHotpoWithOne() {
        int inputNumber = 1;
        int expectedSteps = 0;
        int actualSteps = Kata2.hotpo(inputNumber);
        Assert.assertEquals(actualSteps, expectedSteps);
    }



}
