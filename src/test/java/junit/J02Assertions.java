package junit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class J02Assertions {
    @Test
    void testArray() {
        String str="Junit5 is better than Junit4";

        String[] actualArr = str.split(" ");
        String[] expectedArr = {"Junit5", "is", "better", "than", "Junit4"};
        assertTrue(Arrays.equals(actualArr, expectedArr));

    }


}
