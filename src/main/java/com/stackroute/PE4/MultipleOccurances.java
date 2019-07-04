package com.stackroute.PE4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurances {
    public List<String> occurences(String regex, String text)
    {
        String sw="";
        Pattern pattern = Pattern.compile(regex); //to search for the regular expression
        Matcher matcher = pattern.matcher(text);   //to search regular expression in the given text
        List<String> list=new ArrayList<String>();
        //to find multiple occurences of a regular expression
        while (matcher.find())
        {
            //start and end indexes of the occurence of a regular expression
            sw= "Found at: " + matcher.start() +
                    " - " + (matcher.end()-1);
            list.add(sw);
        }
        //index pointer is set to the beginning
        matcher=matcher.reset();
        if(matcher.find())
        {
            return list;
        }
        else
        {
            return null;
        }

    }
}