package com.stackroute.PE4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    RegularExpression test;
    @Before
    public void setUp(){
        test=new RegularExpression();
    }
    @After
    public void tearDown(){
        test=null;
    }
    @Test
    public void test1(){
        //if pattern found
        String result=test.Search("This is Harry.");
        assertEquals("Is Harry here? True",result);
    }
    @Test
    public void test2(){
        //if pattern not found
        String result=test.Search("This is Henry.");
        assertEquals("Is Harry here? False",result);
    }
    @Test
    public void test3(){
        //if there is pattern multiple times
        String result=test.Search("henryhenryharryHarryHarry");
        assertEquals("Is Harry here? True",result);
    }
    @Test
    public void test4(){
        //if empty string
        String result=test.Search(" ");
        assertEquals("Is Harry here? False",result);
    }

}