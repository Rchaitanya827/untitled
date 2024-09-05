package org.example.array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class commonElementFromSortedArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={1,3,6,9};
        int c[]={1,2,3};

        findCommonElement(a,b,c);
    }

    private static void findCommonElement(int[] a, int[] b, int[] c) {
        int x=0;
        int y=0;
        int z=0;
        int j=0;

        int result[]=new int[5];
        while (x < a.length && y < b.length && z <c.length)
        {
            if(a[x]==b[y] && b[y]==c[z])
            {
                x++;
                y++;
                z++;
                result[j]=x;

            }
            else  if(a[x]>b[y])
            {
                y++;
            }else if(b[y]>c[z])
            {
                z++;
            }
            else {
                x++;
            }
        }

        Arrays.stream(result).forEach(System.out::println);

    }
}
