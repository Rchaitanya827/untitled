package org.example.array;

import java.util.HashMap;
import java.util.Map;

public class ReverseString {
    public static void main(String[] args) {
           reverse("aba");
    }

    public static String reverse(String s)
    {
        String s1[]=s.split(" ");


        Map<String,String> map=new HashMap<>();
        for (int i = 0; i < s.length()-1; i++) {
            if(map.containsKey(s1[i]));
            {

            }
        }
        return null;
    }
}
