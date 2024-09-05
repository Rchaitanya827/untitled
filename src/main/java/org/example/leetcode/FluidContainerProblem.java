package org.example.leetcode;

public class FluidContainerProblem {
    public static void main(String[] args) {
        int a[]={1,8,6,2,5,4,8,3,7};
        int min=0;
        int max=a.length-1;
        int resultArea=0;
        while(min<max)
        {
            int area=Math.min(a[min],a[max])*(max-min);
            if(a[min]<a[max])
            {
                min++;
            }
            else {
                max--;
            }
            if(resultArea<area)
            {
                resultArea=area;
            }

        }
        System.out.println("Max Area is"+resultArea);
    }

}
