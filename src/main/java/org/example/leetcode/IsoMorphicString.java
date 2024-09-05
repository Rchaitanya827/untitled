package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsoMorphicString {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo","bar"));
    }




    public static boolean isIsomorphic(String s, String s2) {

        char[] sChars = s.toCharArray();
        char[] tChars = s2.toCharArray();

        if(s.length() != s2.length())
        {
            return false;
        }
        Map<Character, Character> h=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!h.containsKey(sChars[i]))
            {
                if(h.containsValue(tChars[i]))
                {
                    return false;
                }
                h.put(sChars[i],tChars[i]);
            }
            else {
                char c=h.get(sChars[i]);
                if(c!=tChars[i])
                {
                    return false;

                }
            }

        }
        return true;

    }
}
