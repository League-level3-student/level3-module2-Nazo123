package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionMath {
	
	public static int recursiveMultiplication(int number, int times) {
		//2. if times is 1 
		if(times == 1) {
			//3. return number
			return number;
		}
		//4. else return number + recursionMultiplication(number, times-1)
		else {
		return number+recursiveMultiplication(number,times-1);
		}
		}
	
	//6. Try this one on your own! 
	//Hint: if numberToDevideBy is bigger than number, you can't divide anymore
	public static int recursiveDivision(int number, int numberToDevideBy) {
		if(number<numberToDevideBy) {
			return 0;
		}
	
		else {
		return 1+recursiveDivision(number-numberToDevideBy,numberToDevideBy);
		}
	}
	
	//8. Try this one on your own!
	public static int recursivePower(int number, int power) {
		if(power == 1) {

			return number;
		}
	
		else {
		return number*recursivePower(number,power-1);
		}
	
		
	}
	
	
	
	@Test
	public void testMultiplication() {
		assertEquals(recursiveMultiplication(3, 4), 12 );
		assertEquals(18, recursiveMultiplication(6, 3));
		assertEquals(99, recursiveMultiplication(11, 9));
		//1  Add more JUnit tests like the one above to test your method
		
	}
	
	
	@Test
	public void testDivision() {
		//5  Add JUnit tests to test your method
		assertEquals(recursiveDivision(12, 6), 2);
		assertEquals(2, recursiveDivision(6, 3));
		assertEquals(9, recursiveDivision(99, 11));
	
	}
	@Test 
	public void testPower() {
		//7  Add JUnit tests to test your method
		assertEquals(8, recursivePower(2, 3));
		assertEquals(625, recursivePower(5, 4));
		assertEquals(81, recursivePower(9, 2));
	}
	
}
