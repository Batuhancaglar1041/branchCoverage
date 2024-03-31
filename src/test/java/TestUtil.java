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










}