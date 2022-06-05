package junit;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class J06DisplayName {
	
	@Test
	@DisplayName("Test parceInt() to check if it is throwing for non digit value")
	void testException() {
		
		String str ="Merhaba";
		assertThrows(NumberFormatException.class, ()->{
            System.out.println("testExeception1 is run");
            Integer.parseInt(str);
        });
	}

}
