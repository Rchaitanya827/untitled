package org.example.test;

import java.util.*;
import java.util.stream.Collectors;

public class OccurenceOfLetter {
    public static void main(String[] args) {
        String s="chaitanya  rananaware";
        countOccurenceOfLetter(s);

        Map<String,String> map=new HashMap<>();
        map.put(null,"a");
        map.put(null,null);
        map.put(null,"s");

        Map<String,String> map1=new Hashtable<>();
        System.out.println(map);


    }

    private static void countOccurenceOfLetter(String s) {
       Map<String,Long> map= Arrays.stream(s.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(s1->s1, LinkedHashMap::new,Collectors.counting()));
        System.out.println(map);
    }
}
