package bo.usfx.jhoselineteran;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class CollatzConjectureTest {

  @Test
  public void testHotpoWithInitialValue1() {
    int steps = CollatzConjecture.hotpo(1);
    Assert.assertEquals(steps, 0, "For initial value 1, expected 0 steps.");
  }

  @Test
  public void testHotpoWithInitialValue5() {
    int steps = CollatzConjecture.hotpo(5);
    Assert.assertEquals(steps, 5, "For initial value 5, expected 5 steps.");
  }

  @Test
  public void testHotpoWithInitialValue23() {
    int steps = CollatzConjecture.hotpo(23);
    Assert.assertEquals(steps, 15, "For initial value 23, expected 15 steps.");
  }
}
