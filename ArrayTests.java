import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlaceTwo() {
    int[] input1 = {3,27,99,740,100,6,15,5,12};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{12,5,15,6,100,740,99,27,3}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedTwo() {
    int[] input1 = {3,27,99,740,100,6,15};
    assertArrayEquals(new int[]{15,6,100,740,99,27,3}, ArrayExamples.reversed(input1));
  }
}
