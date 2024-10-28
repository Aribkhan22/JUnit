package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

    StringHelper helper = new StringHelper();

    private String input;
    private String expectedOutput;

    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions(){
       String expectedOutputs [][] ={ {"AACD","CD"},{"ACD","CD"}};
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
        assertEquals("CD", "CD");

    }

    @Test
    public void testTruncateAInFirst2Positions2(){
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }


    //so for converting this into a parameterized test we have to create a new class as it can only have similar type of input and can access only a single constructor.

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_NegativeScenario() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_PositiveScenario(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }


    // method name for test should be proper like (testTruncateAInFirst2Positions)
    @Test
    public void test(){
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));

    }
}