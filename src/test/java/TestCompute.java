import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  @Test
  public void testCountNumberOfOccurrences_WithEmptyQueue() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(0);
    Compute compute = new Compute(mq);

    assertEquals(-1, compute.countNumberOfOccurrences("a"));
  }

  @Test
  public void testCountNumberOfOccurrences_WithNonExistentElement() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(1);
    when(mq.contains("a")).thenReturn(false);
    Compute compute = new Compute(mq);

    assertEquals(0, compute.countNumberOfOccurrences("a"));
  }

}