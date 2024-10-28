package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringHelperTest {

    StringHelper helper = new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD", "CD");

    }

    @Test
    public void testTruncateAInFirst2Positions2(){
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame() {
    }


    // method name for test should be proper like (testTruncateAInFirst2Positions)
    @Test
    public void test(){
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));

    }
}