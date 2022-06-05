package junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

public class J08RepeatTestMultipleTimes {
	
	@RepeatedTest(4)
	void subStringTest() {
		
		assertEquals("Java","Java is a OOP language".substring(0,4));
		System.out.println("substring() is run");
		
	}
	
	@RepeatedTest(3)
	void repeatedTest(TestInfo info) {
		
		assertEquals(2,Math.addExact(1, 1),"1+1 must equal 2");
	}
	
	static int x=1;
	static int y=2;
	static int result=3;
	@RepeatedTest(5)
	void addExactTest() {
		
		assertEquals(result,Math.addExact(x, y));
		System.out.println("result : "+result);
		x++;
		y++;
		result+=2;
		
		
	}
	

}
