package org.example.test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringReverse {
    public static void main(String[] args) {
        reverseString("abc bvc");
        reverserSentence("I am chaitanya");
    }

    private static void reverserSentence(String s) {
       String s1= Arrays.stream(s.split(" ")).map(p->reverseString1(p)+" ")
                .collect(StringBuilder::new,StringBuilder::append,StringBuilder::append)

                .toString();
        System.out.println(s1);
    }

    private static void reverseString(String s) {
        String s1= IntStream.range(0,s.length())
                .mapToObj(i->s.charAt(s.length()-i-1)).
                collect(StringBuilder::new ,StringBuilder::appendCodePoint,StringBuilder::append).toString();
        System.out.println(s1);
    }

    private static String reverseString1(String s) {
        String s1= IntStream.range(0,s.length())
                .mapToObj(i->s.charAt(s.length()-i-1)).
                collect(StringBuilder::new ,StringBuilder::appendCodePoint,StringBuilder::append).toString();
        System.out.println(s1);
        return s1;
    }

}
