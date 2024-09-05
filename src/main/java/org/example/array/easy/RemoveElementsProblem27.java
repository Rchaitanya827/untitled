package org.example.array.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveElementsProblem27 {
    public static int solutions(int[] nums, int val)
    {
        int j=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=val)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        System.out.println("lenth"+nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return j;
    }

    public static void main(String[] args) {
        int[] a={3,2,2,3};
        solutions(a,3);
    }


}
