package junits;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;




import java.time.Month;
import java.util.stream.Stream;

public class ParameterizedTestEx {
	
	
	@ValueSource(strings={"radar","acca","aaaa"})
	@ParameterizedTest
	public void junit(String arg1) {
		assertTrue(StringFunction.isPalindrome(arg1));
		
	}
	
	@EnumSource(Month.class)
	@ParameterizedTest
	public void junit2(Month month) {
		System.out.println(month.getValue());
		
		int monthNumber = month.getValue();
		assertTrue(monthNumber >= 1 && monthNumber <=12);
		
		
		
	}
	
	@EnumSource(value =Month.class, names= {"FEBRUARY"})
	@ParameterizedTest
	public void junit3(Month month) {
		assertEquals(month.length(false),28);

}
	
	@CsvSource(value ={"test:test"}, delimiter = ':')
	@ParameterizedTest
	public void junit4(String Exp, String Act) {
		assertEquals(Exp,Act);

}
	@MethodSource("DPMethod")
	@ParameterizedTest
	public void junit5(String Arg1) {
		
		assertTrue(StringFunction.isPalindrome(Arg1));
		
}	
	
	static Stream<String> DPMethod(){
		return Stream.of("racecar","radar","mom","dad");
		
	}
}
	
	
