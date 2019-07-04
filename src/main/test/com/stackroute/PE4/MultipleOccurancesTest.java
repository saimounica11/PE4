package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MultipleOccurancesTest {

    MultipleOccurances test;
    @Before
    public void setUp(){
        test=new MultipleOccurances();
    }
    @After
    public void tearDown(){
        test=null;
    }
    @Test
    //returns index if the string has regular expression  in it
    public void sampleTestcase() {
        List<String> result=test.occurences("se","she sells seashells by the seashore");
        List<String > h =new ArrayList<>();
        h.add("Found at: 4 - 5");
        h.add("Found at: 10 - 11");
        h.add("Found at: 27 - 28");
        assertEquals(h,result);
    }

    @Test
    //returns index if the string has regular expression  in it
    public void positiveTestcase() {
        List<String> result=test.occurences("ca","mounica mounica mounica");
        List<String > h =new ArrayList<>();
        h.add("Found at: 5 - 6");
        h.add("Found at: 13 - 14");
        h.add("Found at: 21 - 22");
        assertEquals(h,result);
    }

    @Test
    //returns index if the string has regular expression  in it
    public void negativeTestcase() {
        List<String> result=test.occurences("na","here there");
        List<String > h =new ArrayList<>();
        assertEquals(null,result);
    }


    @Test
    //returns index if the string has regular expression  in it
    public void givenNull() {
        List<String> result=test.occurences("na"," ");
        List<String > h =new ArrayList<>();
        assertEquals(null,result);
    }


}