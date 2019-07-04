package com.stackroute.PE4;

public class NumberOfOccurances {
    public int Count(String str) {
        //Remove all a's and replace by ""and count
        int charcount = str.length() - str.replaceAll("a", "").length();


        return charcount;
    }
}