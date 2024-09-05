package org.example.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FIndDuplicateElement {
    public static void main(String[] args) {
        int[] a={1,4,6,7,4,6,8,2};
      /*  for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j])
                {
                    System.out.println(a[i] +" is duplicate at " + i +" and " + j +" position");
                }
            }
        }*/
/*
        Set<Integer> s=new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if(!s.add(a[i]))
            {
                System.out.println(a[i] +" is duplicate element in array");
            }
        }*/

        Map<Integer,Integer> m=new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(m.containsKey(a[i]))
            {
                System.out.println(a[i] +" is present at "+i +" and " +m.get(a[i]) +" position");
            }else {
                m.put(a[i],i);
            }
        }

    }

}
