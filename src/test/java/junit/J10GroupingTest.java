package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class J10GroupingTest {
	
	@Nested
	class multiplyTest{
		@ParameterizedTest
		@CsvSource(value={"-12,-4,3", "-12,4,-3", "12,4,3"})
		void multiplyTestWithNonZero(int rs, int x, int y) {
			assertEquals(rs, Math.multiplyExact(x, y));
			
		}
		
		@ParameterizedTest
		@CsvSource(value= {"0,-4,0","0,4,0","0,0,3"})
		void multiplyTestWithZero(int rs, int x, int y) {
			
			assertEquals(rs, Math.multiplyExact(x, y));
			
		}
		
	}
	
	@Nested
	class addTest{
		@ParameterizedTest
		@CsvSource(value= {"5,3,2","6,4,2","4,3,1"})
		void addTestWithNonZero(int rs, int x, int y) {
			assertEquals(rs, Math.addExact(x, y));
			
		}
		
		@ParameterizedTest
		@CsvSource(value= {"3,3,0","4,4,0","3,3,0"})
		void addTestWithZero(int rs, int x, int y) {
			assertEquals(rs, Math.addExact(x, y));
			
		}
		
		
	}

	
	
}
