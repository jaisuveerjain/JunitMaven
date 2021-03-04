package junits;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public interface DefaultInterface {
	
	
	@Test
	default void testPalindrome() {
		boolean flag  = StringFunction.isPalindrome("radar");
		assertTrue(flag);
		System.out.println("Inside Interface");
		
		
	}

}
