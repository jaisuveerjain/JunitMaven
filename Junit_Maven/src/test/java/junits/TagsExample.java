package junits;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagsExample {
	
	
	@CustomAnnotations
	public void unit1() {
		System.out.println("Inside tag");
	}
	
	
	
	@Test
	@Tag("tag2")
	
	public void junit2() {
		
	}
	
	@Test
	@Tag("tag3")
	
	public void junit3() {
		
	}



}
