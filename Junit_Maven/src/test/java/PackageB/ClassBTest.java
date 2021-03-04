package PackageB;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassBTest {

	
	@Tag("Production1")
	@Test
	@DisplayName("My Junit2")
	public void junit2() {
		System.out.println("Inside Junit2");
	}
}
