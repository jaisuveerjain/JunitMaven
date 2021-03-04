package junits;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EnvExtension.class)
public class ExtensionTest {
	@Test
	public void junit1() {
		
		assertTrue(StringFunction.isPalindrome("radar"));
		
		System.out.println("Inside Test");
	}

}
