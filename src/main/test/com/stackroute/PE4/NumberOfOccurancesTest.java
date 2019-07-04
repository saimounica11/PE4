package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfOccurancesTest {

    NumberOfOccurances test;
    @Before
    public void setUp(){
        test=new NumberOfOccurances();
    }
    @After
    public void tearDown(){
        test=null;
    }
    @Test
    public void positiveTestcase(){
        //check with the word that contain "a"
        int result=test.Count("sai mounica");
        assertEquals(2,result);
    }
    @Test
    public void negativeTestcase(){
        //check with letter that does not have "a"
        int result=test.Count("route");
        assertEquals(0,result);
    }
    @Test
    public void emptyStringTestcase(){
        //check with empty string
        int result=test.Count(" ");
        assertEquals(0,result);
    }
    @Test
    public void StringTestcase(){
        //check with a string that contain both numbers and chars
        int result=test.Count("125a12a");
        assertEquals(2,result);
    }
    @Test
    public void intStringTestcase(){
        //check with a string that contain integers
        int result=test.Count("125");
        assertEquals(0,result);
    }
}