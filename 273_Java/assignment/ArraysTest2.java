package assignment;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArraysTest2 {
	
	@Test 
	public void ArrayFailTest() {
		int[] testArr = {9,1,4,5,2,6,3};
		Arrays arr = new Arrays(testArr);
		assertArrayEquals(new int[]{1,2,2,4,5,6,9}, arr.sorted());
	}
}
