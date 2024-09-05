package org.example.java8;

import org.example.Main;

import java.security.KeyStore;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfCharacterInString {
    public static void main(String[] args) {
        String s="chaitanya";
        Map<String,Long> a=Arrays.stream(s.split("")).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                ;
        a.entrySet().stream().forEach((entry)-> System.out.println( entry.getKey()+"  "+entry.getValue()));
    }
}
