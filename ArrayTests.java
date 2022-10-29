import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace1() {
    int[] input1 = { 1,2,3,4,5 };
    ArrayExamples.reverseInPlace(input1);
    
    for(int i = 0; i<input1.length; i++){
      System.out.println(" ");
      System.out.print(input1[i]);
    }  
    System.out.println(" ");
    assertArrayEquals(new int[]{ 5,4,3,2,1 }, input1);
	}


  @Test
  public void testReversed1() {
    int[] input1 = { 1,2,3 };
    

    assertArrayEquals(new int[]{ 3,2,1 },     ArrayExamples.reversed(input1));
    
    
  }
}
