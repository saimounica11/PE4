package com.stackroute.PE4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public String Search(String str){

        String output="";
        //pattern to be searched
        Pattern pattern= Pattern.compile("Harry");
        //search for the pattern
        Matcher m = pattern.matcher(str);
        //if found
        if(m.find()){
            output= "Is Harry here? True";

        }
        //if not found
        else{
            output="Is Harry here? False";
        }
        return output;
    }
}