package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		_00_LinearSearch a = new _00_LinearSearch();
		String[] words = {"test","2","three","tet","bob"};
		//1. use the assertEquals method to test your linear search method.
	assertEquals(a.linearSearch(words,"tet"),3);
	String[] wordsa = {"Chocholate","24","bob","Sleep","Spelling"};
	assertEquals(a.linearSearch(wordsa,"bob"),2);
	String[] wordsb = {"test","2","hi","tet","bob","Hello","5","Testing","Last"};
	assertEquals(a.linearSearch(wordsb,"Hello"),5);
	}

	@Test
	public void testBinarySearch() {
		_01_BinarySearch a = new _01_BinarySearch();
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] ar = {1,4,6,7,9,10,13,16,17,19,21};
		assertEquals(a.binarySearch(ar, 0, 6, 9),4);
		int[] arr = {1,5,7,10,21,65,100};
		assertEquals(a.binarySearch(arr,0, 3, 5),1);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
