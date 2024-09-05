package org.example.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IsPrefixOfWord {
    public static void main(String[] args) {
        System.out.println(solution("i love eating burger","burg"));
    }
    public static int solution(String s, String searchKey)
    {
        String[] collect=s.split(" ");
        for (int i = 1; i <= collect.length; i++) {
            if(collect[i].startsWith(searchKey))
            {
                return i+1;
            }


        }
        return -1;
    }
}
