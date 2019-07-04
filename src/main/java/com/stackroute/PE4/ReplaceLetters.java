package com.stackroute.PE4;

public class ReplaceLetters {
    public String Replace(String str){
        //replace all d with f

        String str1= str.replaceAll("d","f");
        //replace all l with t
        String str2= str1.replaceAll("l","t");
        //result
        return str2;
    }
}