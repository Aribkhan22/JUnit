package com.example.business;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void testMockListSizeMethod(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);

        assertEquals(2,listMock.size());
        assertEquals(2,listMock.size());
    }

    @Test
    public void testMockListSizeMethod_ReturnMultipleValues(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);

        assertEquals(2,listMock.size());
        assertEquals(3,listMock.size());
    }

    @Test
    public void testListMockListGet(){
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("Hello");
        //Argument Matcher
        when(listMock.get(anyInt())).thenReturn("Hello");
        assertEquals("Hello",listMock.get(0));
        assertEquals(null,listMock.get(1));
    }

    @Test(expected = RuntimeException.class)
    public void testListMockList_throwException(){
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("Hello");
        //Argument Matcher
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("something..."));
        listMock.get(0);
    }

    @Test(expected = RuntimeException.class)
    public void testListMockList_mixingUp(){
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("Hello");
        when(listMock.subList(anyInt(),5)).thenThrow(new RuntimeException("something..."));
        listMock.get(0);
    }

    @Test
    public void testListMockListGet_usingBDD(){
        //Given
        List<String> listMock = mock(List.class);
        given(listMock.get(anyInt())).willReturn("Hello");
        //When
        String firstElement = listMock.get(0);
        //Then
        assertThat(firstElement, is("Hello"));
    }
}
