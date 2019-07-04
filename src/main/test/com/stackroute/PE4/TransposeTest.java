package com.stackroute.PE4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose test;
    @Before
    public void setUp(){
        test=new Transpose();
    }
    @After
    public void tearDown(){
        test=null;
    }
    @Test
    public void positiveTestcase(){
        //check with multiple words in a string
        String result=test.reverse("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",result);
    }
    @Test
    public void negativeTestcase(){
        //check with single word in a string
        String result=test.reverse("All");
        assertEquals("llA",result);
    }
    @Test
    public void intStringTestcase(){
        //check with string that contain both charecters and digits
        String result=test.reverse("ajans283 37uhfdn");
        assertEquals("382snaja ndfhu73",result);
    }
    @Test
    public void emptyString(){
        //check with empty string
        String result=test.reverse("");
        assertEquals("",result);
    }

}