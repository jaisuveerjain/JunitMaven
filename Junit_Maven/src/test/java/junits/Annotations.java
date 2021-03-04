package junits;

 

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

 

public class Annotations {
	 @BeforeAll
	    public static void beforealljunit() {
	        System.out.println("Before all Junit");
	        
	    }
    @BeforeEach
    public void beforejunit() {
        System.out.println(" Before Junit");
        
    }
    @Disabled
    @Test
    public void junit1() {
        System.out.println(" Junit");
        
    }
    
    @AfterEach
    public void afterjunit() {
        System.out.println("after Junit");
        
    }
    @AfterAll
    public static void afteralljunit() {
        System.out.println(" After all Junit");
        
    }

 

}
