package org.example.test;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1121));
    }

    private static boolean isPalindrome(int i) {
        int temp=i;
        int result=0;
        while(temp>0)
        {
            int q=temp%10;
            int r=temp/10;
            result=result*10+q;
            temp=r;

        }
        if(i==result)
        {
            System.out.println("palindrome");
            return true;
        }
        else {
            System.out.println("not palindrome");
            return false;
        }

    }

}
