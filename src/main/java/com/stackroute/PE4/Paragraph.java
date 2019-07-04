package com.stackroute.PE4;

import java.util.Arrays;

public class Paragraph {
    public String[] choice(String s)
    {
        String [] words=s.split(" ");   //splitting of words in a string
        Arrays.sort(words);           //to sort those words
        return words;


    }
}