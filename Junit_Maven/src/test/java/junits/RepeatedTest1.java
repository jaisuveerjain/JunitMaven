package junits;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTest1 {
	

	@RepeatedTest(4)
	public void junit1() {
		System.out.println("Inside junit 1");
	}

}
