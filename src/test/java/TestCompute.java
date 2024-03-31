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

  @Test
  public void testCountNumberOfOccurrences_WithSingleOccurrence() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(1);
    when(mq.contains("a")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("a");
    Compute compute = new Compute(mq);

    assertEquals(1, compute.countNumberOfOccurrences("a"));
  }
  @Test
  public void testCountNumberOfOccurrences_WithMultipleOccurrences() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(3);
    when(mq.contains("a")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("a");
    when(mq.getAt(1)).thenReturn("b");
    when(mq.getAt(2)).thenReturn("a");
    Compute compute = new Compute(mq);

    assertEquals(2, compute.countNumberOfOccurrences("a"));
  }

}