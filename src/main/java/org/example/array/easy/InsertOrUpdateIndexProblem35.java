package org.example.array.easy;

public class InsertOrUpdateIndexProblem35 {
    public static void main(String[] args) {
        int nums[]={1,3,5,8};
        int target=2;
        System.out.println(solution(nums,target));
    }

    public static int solution(int nums[],int target)
    {
        int l=0;
        int h=nums.length-1;
        int m=(l+h)/2;
        int positionToBeinserted=0;
        if (target < nums[m]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        while (l<h) {
             m=(l+h)/2;


            if (nums[m] == target) {
                return m;
            } else if (target < nums[m]) {
                h = m - 1;
                positionToBeinserted=h;
            } else {
                l = m + 1;
                positionToBeinserted=l;
            }
        }
        return positionToBeinserted;
    }
}
