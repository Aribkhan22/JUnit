package com.example.mockito;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class HamcrestMatchersTest {

    @Test
    public void test(){
        List<Integer> scores = Arrays.asList(99,200,45,69,89);
        //scores has 5 items
        assertThat(scores , Matchers.hasSize(5));
        assertThat(scores, hasItems(99,200));

        assertThat(scores, everyItem(greaterThan(40)));

        //String
        assertThat("", isEmptyString());
        assertThat(null, isEmptyOrNullString());

        //Arrays
        Integer [] marks = {1,2,3};

        assertThat(marks, arrayWithSize(3));
        assertThat(marks, arrayContaining(1,2,3));
        assertThat(marks, arrayContainingInAnyOrder(2,1,3));
    }
}
