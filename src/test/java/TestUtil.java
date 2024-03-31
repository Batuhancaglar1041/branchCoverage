import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }
  @Test
  public void testCompute_WithOneArgument() {
    Util util = new Util();
    assertFalse(util.compute(1));
  }

  @Test
  public void testCompute_WithEvenNumberOfArguments() {
    Util util = new Util();
    assertFalse(util.compute(1, 2));
  }

  @Test
  public void testCompute_WithSumDivisibleByArgument() {
    Util util = new Util();
    assertTrue(util.compute(1, 3, 5)); // Sum = 9, 9 üçe bölünebilir
  }
  @Test(expected = RuntimeException.class)
  public void testCompute_WithZeroElementInArguments_ThrowsException() {
    Util util = new Util();
    util.compute(1, 0, 2); // 0 argümanı içeren durumu test ediyoruz
  }








}