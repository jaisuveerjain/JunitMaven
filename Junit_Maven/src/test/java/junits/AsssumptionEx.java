package junits;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AsssumptionEx {
	
	@DisplayName("Assumptions Example")
	
	@Test
	public void junit1() {
		System.setProperty("ENV","DEV");
		//assumeTrue("DEV".equals(System.getProperty("ENV")));
        
        assertTrue(false);
	}
	

}
