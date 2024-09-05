package org.example.array;

import javax.print.DocFlavor;
import java.util.HashSet;

public class FindCommonElemntInTwoArray {
    public static void main(String[] args) {
        int[] a={1,4,5,6,7,8,4};
        int[] b={4,7,6,8};

        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            if(set.contains(b[i]))
            {
                System.out.println(b[i]+ " is common element is both array");
            }

        }
    }
}
