package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String[] args) {
        int a[]={4,6,8,3,4,6,0};

        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int searchKey=8-a[i];
            if(map.containsKey(searchKey))
            {
                System.out.println(a[i]+","+map.get(searchKey));
            }
            else {
                map.put(a[i],a[i]);
            }

        }
    }
}
