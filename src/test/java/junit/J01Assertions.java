package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class J01Assertions {
    @Test
    void testToFindMin(){
        assertTrue(Math.min(14,11)==11);

    }
}
