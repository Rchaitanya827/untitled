package org.example.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lengthOfLastWordLeetCode58 {
    public static void main(String[] args) {
        String s="    day my";
        System.out.println(solution(s));
    }
    public static int solution(String s)
    {
//        List<String> l=Arrays.stream(s.split(" ")).collect(Collectors.toList());
//
//        return l.get(l.size()-1).length();
      /*  String[] ll=s.split(" ");
        return ll[ll.length-1].length();*/
        s=s.trim();

        if(!s.contains(" "))
        {
            return s.length();
        }
        char[] c=s.toCharArray();

        for (int i=c.length-1;i>=0;i--)
        {
            if(c[i]==32)
            {

                return (c.length)-(i+1);
            }
        }
        return 0;

    }
}
