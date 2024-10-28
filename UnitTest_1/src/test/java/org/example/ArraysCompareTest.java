package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArraysCompareTest {

    @Test
    public void testArraySort(){
        int [] number = {12,5,8,1};
        int [] expected = {1,5,8,12};
        Arrays.sort(number);
        Assert.assertArrayEquals(expected,number);
    }

    @Test
    public void testArraySort_NullArray(){
        int [] number = null;
        try {
            Arrays.sort(number);
        }catch (NullPointerException e){
            //success
        }
    }

    @Test(expected = NullPointerException.class)
    public void testArray_exception(){
        int [] number = null;
        Arrays.sort(number);
    }

    @Test(timeout = 100)
    public void testSort_Performance(){
        int[] array = {12,5,8,1};
        for(int i=1;i<=1000000;i++){
            array[0] = i;
            Arrays.sort(array);
        }
    }
}

