package org.example.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PalindromeCharacter {
    public static void main(String[] args) {
        String s="aba";
        System.out.println(isPalindrome("aba"));

    }

    public static boolean isPalindrome(String s)
    {
        s.toLowerCase();
        return IntStream.range(0,s.length()/2)
                .noneMatch(i->s.charAt(i)!=s.charAt(s.length()-i-1));
    }


}
