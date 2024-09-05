package org.example.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int a[]={1,4,6,3,4,4,3};
        Set<Integer> s=new HashSet<>();
        for (int j=0;j<a.length;j++)
        {
            if(s.contains(a[j]))
            {
                System.out.println(a[j] +"  is duplicate element in array");
            }else {
                s.add(a[j]);
            }
        }
    }
}
