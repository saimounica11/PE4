package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParagraphTest {
    Paragraph test;

    @Before
    public void setUp() {
        test = new Paragraph();
    }

    @After
    public void tearDown() {
        test = null;
    }

    @Test
    //aphabetical order of words in a given string
    public void sampleTestcase() {
        String[] result = test.choice("java is a programming language");
        assertArrayEquals(new String[]{"a","is","java","language","programming"}, result);
    }


    @Test
    //aphabetical order of words in a given string
    public void positiveTestcase() {
        String[] result = test.choice("ab a abc");
        assertArrayEquals(new String[]{"a","ab","abc"}, result);
    }


    @Test
    //aphabetical order of words in a given string
    public void givenEmptyString() {
        String[] result = test.choice(" ");
        assertArrayEquals(new String[]{}, result);
    }

    @Test
    //aphabetical order of words in a given string
    public void givenIntInString() {
        String[] result = test.choice("saimounica2 ab a");
        assertArrayEquals(new String[]{"a", "ab","saimounica2"}, result);
    }

    @Test
    //aphabetical order of words in a given string
    public void givenSpecialCharecters() {
        String[] result = test.choice("aa $ # @ !");
        assertArrayEquals(new String[]{"!", "#","$","@","aa"}, result);
    }



}