package junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class J03BeforeEach_AfterEach {

    String str;


    @BeforeEach
    void beforeEach(){
        str= "Junit5 is better than Junit";
        System.out.println("beforEach() is executed");
    }

    @AfterEach
    void afterEach(){
        str=null;
        System.out.println("afterEach() is executed");
    }

    @Test
    void testArray(TestInfo info){
        String[] actualArr = str.split(" ");
        String[] expectedArr = {"Junit5", "is", "better", "than", "Junit4"};
        System.out.println(info.getDisplayName()+" is executed");
    }

}
