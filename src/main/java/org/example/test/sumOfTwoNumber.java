package org.example.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class sumOfTwoNumber {


    public static void main(String[] args) {
        int a[]={5,8,9,6,3};
        int result[]=findSumOfTwo(a,8);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] findSumOfTwo(int a[],int target)
    {
        Map<Integer,Integer> map=new Hashtable<>();
        for (int i = 0; i < a.length; i++) {
            int result=target-a[i];
            if(map.containsKey(result))
            {
                return new int []{i,map.get(result)
                };
            }
            else {
                map.put(a[i],i);
            }
        }
        return new int[]{};
    }

}
