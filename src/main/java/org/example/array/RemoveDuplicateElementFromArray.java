package org.example.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementFromArray {
    static int duplicateCount=0;
    public static int solution(int[] nums)
    {//{0,0,1,1,1,2,2,3,3,4}
        int j=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] !=nums[i-1])
            {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
    int[]    nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(solution(nums));
    }
}
